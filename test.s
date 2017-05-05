.data 
 a: .word 0 
 b: .word 0 
  
 .text  
 addi $t0, $zero, 9 
 sw $t0, a
addi $t0, $zero, 7 
 sw $t0, b
addi $t0, $zero, 2 
 sw $t0, a

 li $v0, 1 
 lw $a0, a 
 syscall 

 li $v0, 1 
 lw $a0, a 
 syscall 
