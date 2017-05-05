.data 
 a: .word 0 
 b: .word 0 
 c: .word 0 
  
 .text  
 addi $t0, $zero, 0 
 sw $t0, a
addi $t0, $zero, 0 
 sw $t0, b


lw $t0, a
lw $t1, b
sub $t2, $t0, $t1 
 sw $t2, a
lw $t2, a
addi $t0, $t2, 0 
 sw $t0, c

 li $v0, 1 
 lw $a0, c 
 syscall 
