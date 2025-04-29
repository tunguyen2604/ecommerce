.eqv KEY_CODE   0xFFFF0004       # ASCII code from keyboard, 1 byte 
.eqv KEY_READY  0xFFFF0000       # =1 if has a new keycode ? 
                                 # Auto clear after lw 
 
.eqv DISPLAY_CODE   0xFFFF000C   # ASCII code to show, 1 byte 
.eqv DISPLAY_READY  0xFFFF0008   # =1 if the display has already to do 
                                 # Auto clear after sw 
.data
exit: .asciz "exit"
.text 
main:
	li s2, 65
	li s3, 91
	li s4, 97
	li s5, 123
	li s6, 48
	li s7, 58
	li s8, 4
	la s0, exit
    li  a0, KEY_CODE 
    li  a1, KEY_READY 
    li  a2, DISPLAY_CODE 
    li  a3, DISPLAY_READY
    jal loop
endMain:
	li a7, 10
	ecall
loop:       
WaitForKey:   
    lw      t1, 0(a1)               # t1 = [a1] = KEY_READY da nhap vao chua
    beq     t1, zero, WaitForKey    # if t1 == 0 then Polling 
ReadKey:      
    lw      t0, 0(a0)               # t0 = [a0] = KEY_CODE key
WaitForDis:   
    lw      t2, 0(a3)               # t2 = [a3] = DISPLAY_READY da san sang hien thi chua
    beq     t2, zero, WaitForDis    # if t2 == 0 then polling  
Encrypt:      # ma hoa
#a0-a4: key, s0 gia tri tung ky tu trong "exit", s1 k, s2-s7 cac gia tri so sanh, s8 4
	bne t0, s0, else #so sanh voi tung ky tu trong exit, neu bang ca 4 ky tu=>end
		addi s0, s0, 1
	else:
		la s0, exit 
	if1: #upper to lowercase
		blt t0, s2, if2
		bge t0, s3, if2
		addi t0, t0, 32
	j endIf2
	if2:#lowercase to upper case
		blt t0, s4, if3
		bge t0, s5, if3
		addi t0, t0, -32
	j endIf2
	if3:#neu la so thi giu nguyen
		blt t0, s6, else2
		bge t0, s7, else2
	j endIf2
	else2:#neu la ky tu khac thi = '*'<=>=42
		li t0, 42
	endIf2:
ShowKey: #hien thi
sw      t0, 0(a2)                 
ifExitThenEnd:
	blt s1, s8, loop
jr ra
