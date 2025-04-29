.eqv MONITOR_SCREEN 0x10000000  # Dia chi bat dau cua bo nho man hinh
.data 
namCanh: .word -1, 49, 1, -49, 0, 11, 1, 10, -1, 34
# hàm c?a các c?nh c?a ngôi sao d?ng ax+b v?i a, b l?n l??t là các giá tr? ? trên
.eqv RED            0x00FF0000  # Cac gia tri mau thuong su dung 
.eqv YELLOW         0x00FFFF00 

.text 
main:
	la s8, namCanh
	li s1, 0	
	li s2, 11       # 44/4 = 11
	lw s3, 4(s8) 
	li s4, 25       # 100/4 = 25
	li s5, 29       # 116/4 = 29
	li s6, 22       # 88/4 = 22
	li s7, 32       # 128/4 = 32
	li  a0, MONITOR_SCREEN      
	li  t0, YELLOW	 
	li  t1, RED 
	li t3, RED
	li a7, 32       # màn hình 32x32 (t??ng ?ng)

veLaCo:
loop2: #vòng l?p y
	bgt s0, a7, endloop2
	loop3: #vòng l?p x
		bgt s1, a7, endloop3 
		if6:
			bgt s0, s5, endif6 # lon hon 29
			addi t3, t1, 0	
		elseif6:
			bge s0, s2, else6	#nho hon 11
			ble s0, s6, else6
			if7:
				jal cham
				bnez a5, endif7
				jal doiMau
			endif7:
		else6:
			if8:
				addi a6, a6,1
				li t5, 1
				li t6, 4
				bne a6, t5, endif8
				bne a6, t6, endif8
				jal doiMau
			endif8:
		
		endif6:
		sw  t3, 0(a0) 
		addi a0, a0, 4
		addi s1, s1, 1
		j loop3
	endloop3:
	li s1, 0
	addi s0, s0, 1
j loop2
endloop2:
endVeLaCo:
cham: #xác ??nh xem v? trí hi?n t?i ?ã ?i qua các c?nh c?a hình ngôi sao ch?a
#a0 scr, t0 vang, t1 red, s0 y, s1 x, 
# s1-s7 5 44 1 100 116 88 128, 
#s8 dia chi chuoi ham, s9 yTinh, s10 tTrcDo
#t2 temp, t3 mau,t4 i,  t5 temp2, t6 temp3, 
#a1 temp4, a2 tem5, a3 temp6, a4 temp7, a5 cham, a6 so lan cham
	li t4, 0
	loop1:
		bge t4, s1, endloop1
		if2:
			bgt s0, s2, endif2
			ble t4, s3, endif2
			j endloop1 
		endif2:
		lw t2, 0(s8)
		lw t5, 4(s8)
		lw t6, 8(s8)
		lw a1, 12(s8)
		mul s9, t2, s1
		add s9, s9, t5 
		mul s10, t6, s1
		add s10, s10, a1
		sub a2, s0, s9
		bnez a2, endif3
		if3:
			addi s9, s9, 1
		endif3:
		sub a3, s1, s10
		bnez a3, endif4
		if4:
			addi s10, s10, 1
		endif4:
		mul a4, a2, a3
		bgt a4,zero, endif5
		if5:
			li a5, 1
			j endloop1
		endif5:
	endloop1:
	la s8, namCanh
jr ra
doiMau: # n?u ?ã ?i qua m?t c?nh c?a ngôi sao thì ??i màu
	beqz s0, endDoiMau
	li t2, 29       # 116/4 = 29
	beq s0, t2, endDoiMau
	if1:
		bne t3, t0, else1
		mv t1, t3
		j endif1
	else1:
		mv t0, t3
	endif1:
endDoiMau:
	jr ra
