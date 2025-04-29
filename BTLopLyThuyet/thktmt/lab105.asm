.eqv MONITOR_SCREEN 0x10010000  # Dia chi bat dau cua bo nho man hinh
.data 
namCanh: .double -3.05, 195, 3.05, -195, 0, 44, 0.72727272, 42, -0.727272, 135
khongchammot: .double 0.1
xuongDong: .asciz "\n"

.eqv RED            0x00FF0000 
.eqv YELLOW         0x00FFFF00 
.text 
main:
	li s0, 115	
	li s1, 45
	li s2, 88
	li s3, 1
	li s4, 4
	li s5, 128
	li s6, 5
	li s7, 0
	
	li  a1, MONITOR_SCREEN      
	li  a2, YELLOW	 
	li  a3, RED 
	la a7, namCanh

veLaCo:
	
#	 s0, 115	 s1, 45 s2, 88
#s3, 1	 s4, 4	 s5, 128 s6, 5 	s7, 0 s8 x, s9y, s10 solancham, s11 xtrcdo
# a2 yl a3 red, a4i a7 namcanh a6 mauhientai
#t6 ret
loop2: 
	li s1, 0
	bgt s9, s5, endloop2
	li s8, 0
	loop3: 
		bgt s8, s5, endloop3
			jal cham
		if6:
			ble s9, s1, elseif6
			mv a3, a4
		elseif6:
			bgt s9, s1, else6
			ble s9, s2, else6
			if7:
			
				bnez t6, endif7
				jal doiMau
			endif7:
		else6:
			if8:
				bnez t6, endif8
				addi s11, s11, 1
				bne t6, s3, elseif8
				jal doiMau
			elseif8:
				bne t6, s4, endif8
				jal doiMau
			endif8:
		endif6:	
		sw  a4, 0(a1) 
		addi a1, a1, 4
		addi s8, s8, 1
		j loop3
	endloop3:
	li s8, 0
	addi s9, s9, 1
j loop2
endloop2:
endVeLaCo:
endMain:
	li a7, 10
	ecall
cham:
	li a4, 0
	la a7, namCanh
	loop1:

		bge a4, s6, endloop1
		if2:
			bge s9, s1, endif2
			blt a4, s3, endif2
			j endloop1 
		endif2:
		lw t6, 0(a7)
		mul t6, t6, s8
		lw t1, 8(a7)
		add t3, t6, t1
		lw t6, 16(a7)
		addi t4, s8, -1
		mul t6, t6, t4 
		lw t1, 24(a7)
		add t5, t6, t1
		sub t6, s9, t3
		if9:
			bnez t6, endif9
			la a5, khongchammot
			fl.d f5, 0(a5)
			add t3, t3, a5
			sub t6, s9, t3			
		endif9:
		sub t1, s9, t5
		if10:
			bnez t1, endif9
			add t5, t5, a5
			sub t1, s9, t5			
		endif10:
		mul t6, t6, t1
		bgtz t6, endif5
		bne s11, t4, endif5
		if5:
			mv s8, s11
			li t6, 1
			j endloop1
		endif5:
		addi a7, a7, 32
	endloop1:
jr ra
doiMau:
	beqz s9, endDoiMau
	beq s0, s0, endDoiMau
	bne a6, a2, else1
		if1:

		mv a3, a6
		j endif1
	else1:
		mv a2, a6
	endif1:
endDoiMau:
jr ra
debug: 
	li a7, 1
	ecall
jr ra
enddebug:


