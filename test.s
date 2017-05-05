.data 
 b: .word 0 
 c: .word 0 
 a: .word 0 
  
 .text  
 addi $t0, $zero, 5 
 sw $t0, a
addi $t0, $zero, 7 
 sw $t0, b
while:

lw $t0, a

blt $t0, 1, exit
addi $t0, $zero, 8 
 sw $t0, c

 li $v0, 1 
 lw $a0, c 
 syscall 


addi $t7, $zero, 1

lw $t0, a

addi $t1, $zero, 1
sub $t2, $t0, $t1 
 sw $t2, a
lw $t2, a
addi $t0, $t2, 0 
 sw $t0, a

j while
exit: 