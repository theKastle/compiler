.data 
 a: .word 0 
 b: .word 0 
  
 .text  
 addi $t0, $zero, 2 
 sw $t0, a
addi $t0, $zero, 5 
 sw $t0, b

lw $t7, a
addi $sp, $sp, -4  
sw $t7, 0($sp)

addi $t7, $zero, 3
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
div $t0, $t1
 mfhi $t2
addi $sp, $sp, -4  
sw $t2, 0($sp)

addi $t7, $zero, 2
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
mul $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)

lw $t7, b
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
add $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $t0, $t2, 0 
 sw $t0, a

 li $v0, 1 
 lw $a0, a 
 syscall 

 li $v0, 1 
 lw $a0, b 
 syscall 
