.data 
enter: .asciz "\n"
# ------------------------------------------------------ 
#           col 0x1    col 0x2    
#  row 0x1      0         col 0x4     col 0x8  1          
#             0x11      2           3            0x21        
#  row 0x2      4         0x41        0x81          5          
#             0x12      6           7 0x22        
#  row 0x4      8         0x42        0x82 9          
#             0x14      a           b  0x24        
#  row 0x8      c         0x44        0x84 d          
#             0x18      e           f 0x28        0x48        0x88 
# ------------------------------------------------------ 
# Command row number of hexadecimal keyboard (bit 0 to 3) 
# Eg. assign 0x1, to get key button 0,1,2,3 
#     assign 0x2, to get key button 4,5,6,7 
# NOTE must reassign value for this address before reading, 
# eventhough you only want to scan 1 row 
.eqv IN_ADDRESS_HEXA_KEYBOARD       0xFFFF0012 
# Receive row and column of the key pressed, 0 if not key pressed  
# Eg. equal 0x11, means that key button 0 pressed
# Eg. equal 0x28, means that key button D pressed. 

.eqv OUT_ADDRESS_HEXA_KEYBOARD      0xFFFF0014 
.text 

main:             
li  t1, IN_ADDRESS_HEXA_KEYBOARD 
li  t2, OUT_ADDRESS_HEXA_KEYBOARD 
li t4, 0x010
re_read:
li  t3, 0x01
loop: 

# check row 4 with key C, D, E, F  
polling:          
sb  t3, 0(t1 )      
# must reassign expected row 
lb  a0, 0(t2)       
# read scan code of key button 
print:        
li  a7, 34          
# print integer (hexa) 
ecall 
la a0, enter
li a7, 4
ecall
sleep:        
li  a0, 100         
# sleep 100ms 
li  a7, 32 
ecall        
back_to_polling: 
slli t3, t3, 1 
bge t3, t4, re_read
j     polling       
# continue polling 
