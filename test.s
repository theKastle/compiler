.data 
 a: .word 0 
 b: .word 0 
 c: .word 0 
  
 .text  
 addi $t0, $zero, 5 
 sw $t0, a
addi $t0, $zero, 9 
 sw $t0, b



addi $t7, $zero, 1

lw $t0, a

addi $t1, $zero, 1
sub $t2, $t0, $t1 
 sw $t2, a
lw $t0, b

lw $t1, a
sub $t2, $t0, $t1 
 sw $t2, b
lw $t2, b
addi $t0, $t2, 0 
 sw $t0, c

 li $v0, 1 
 lw $a0, c 
 syscall 
