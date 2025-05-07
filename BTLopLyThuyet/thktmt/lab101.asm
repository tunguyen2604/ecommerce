.eqv SEVENSEG_LEFT 0xFFFF0011
.eqv SEVENSEG_RIGHT 0xFFFF0010

.text
main: 
	li a0, 0x66	#hexa code of 4
	jal SHOWSEG_LEFT
	li a0, 0x3F	#hexa code of 0
	jal SHOWSEG_RIGHT
exit:
	li a7, 10
	ecall
end_main:
SHOWSEG_LEFT:
	li t0, SEVENSEG_LEFT
	sb a0, 0(t0)
	jr ra
SHOWSEG_RIGHT:
	li t0, SEVENSEG_RIGHT
	sb a0, 0(t0)
	jr ra
