.eqv SEVENSEG_LEFT 0xFFFF0011
.eqv SEVENSEG_RIGHT 0xFFFF0010
.data
ma7doan: .byte 0x3F, 0x06, 0x5B, 0x4F, 0x66, 0x6D, 0x7D, 0x07, 0x7F, 0x6F
message: .asciz "nhap vao so nguyen duong thu nhat va thu 2 lan luot: "


.text
main: 
	jal input	#nhap vao 2 so nguyen duong
	li a7, 1
	addi a0, s0, 0
	ecall
	li a7, 1
	addi a0, s1, 0
	ecall
	jal decimalToMa7doan
	jal SHOWSEG_LEFT	#gan vao ben tai
	jal SHOWSEG_RIGHT	#gan vao ben phai
exit:
	li a7, 10
	ecall
end_main:
decimalToMa7doan: #doi he 10 sang ma 7 doan abcdefg bang mang ma 7 doan
	la s2, ma7doan
	add s0, s0, s2
	add s1, s1, s2
	lb s3, 0(s0)
	lb s4, 0(s1)
	jr ra
input: #in ra 2 dong thong bao va nhap vao
	li a7, 4
	la a0, message
	ecall
	li a7, 5
	ecall
	addi s0, a0, 0
	li a7, 4
	la a0, message
	ecall
	li a7, 5
	ecall
	addi s1, a0, 0
	jr ra
SHOWSEG_LEFT:
	li t0, SEVENSEG_LEFT
	addi a0, zero, 0x3F
	sb s3, 0(t0)
	jr ra
SHOWSEG_RIGHT:
	li t0, SEVENSEG_RIGHT
	sb s4, 0(t0)
	jr ra
