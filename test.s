.data 
 n: .word 0 
 f: .word 0 
  
 .text  
 
 li $v0, 5 
 syscall 
 sw $v0, n 
 addi $t0, $zero, 1 
 sw $t0, f
while:

lw $t0, n

blt $t0, 1, exit



lw $t0, f

lw $t1, n
mul $t2, $t0, $t1 
 sw $t2, f
lw $t2, f
addi $t0, $t2, 0 
 sw $t0, f


addi $t7, $zero, 1

lw $t0, n

addi $t1, $zero, 1
sub $t2, $t0, $t1 
 sw $t2, n
lw $t2, n
addi $t0, $t2, 0 
 sw $t0, n

j while
exit: 
 li $v0, 1 
 lw $a0, f 
 syscall 
