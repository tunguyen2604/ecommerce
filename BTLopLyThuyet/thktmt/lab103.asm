.eqv MONITOR_SCREEN 0x10010000  # Dia chi bat dau cua bo nho man hinh 
.eqv RED            0x00FF0000  # Cac gia tri mau thuong su dung 
.eqv GREEN          0x0000FF00 
.eqv BLUE           0x000000FF 
.eqv WHITE          0x00FFFFFF 
.eqv YELLOW         0x00FFFF00 
.text 
main:
	li  a0, MONITOR_SCREEN      
	li  t0, BLUE 
	li  t1, RED 
	li t2, 0
	li t4, 2
	li t5, 8
	li t6, 0
	li s0, 64
	jal veBanCo
endMain:
	li a7, 10
	ecall

# Nap dia chi bat dau cua man hinh 
#a0 scr, t0 blue, t1 red, t2 dem, t6 temp, t3 rem, t4 2, t5 8, s0 64
veBanCo:
	loop: #vong lap ve 64 o co
		rem t6, t2, t5 #chia lay phan du cho 8 de xac dinh cuoi moi hang
		bnez t6, endifEndRow
		ifendRow: #doi nguoc 2 mau voi nhau
		addi t6, t0, 0
		addi t0, t1, 0
		addi t1, t6, 0
		endifEndRow:
		bge t2, s0, endloop #thoat vong lap khi lap du 24 lan
		rem t3, t2, t4	#chia lay phan du cho 2 de xac dinh cot chan le
		beqz t3, veDo	#ve mau do hay xanh
		veXanh:
		sw  t0, 0(a0)    
		j endVe     
		veDo:
		sw  t1, 0(a0) 
		endVe:
		addi a0, a0, 4	#cap nhat gia tri cac thanh ghi dem
		addi t2, t2,1
		
	j loop
	endloop:
jr ra

