.data 
 b: .word 0 
 c: .word 0 
 j: .word 0 
 a: .word 0 
 i: .word 0 
  
 .text  
 addi $t0, $zero, 7 
 sw $t0, a
addi $t0, $zero, 0 
 sw $t0, b
addi $t0, $zero, 11 
 sw $t0, c
addi $t0, $zero, 2 
 sw $t0, i
while1:

lw $t0, i

blt $t0, 1, exit1
addi $t0, $zero, 2 
 sw $t0, j
while0:

lw $t0, j

blt $t0, 1, exit0

 li $v0, 1 
 lw $a0, j 
 syscall 

lw $t7, j
addi $sp, $sp, -4  
sw $t7, 0($sp)

addi $t7, $zero, 1
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $t0, $t2, 0 
 sw $t0, j

j while0
exit0: 
 li $v0, 1 
 lw $a0, a 
 syscall 

lw $t7, i
addi $sp, $sp, -4  
sw $t7, 0($sp)

addi $t7, $zero, 1
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $t0, $t2, 0 
 sw $t0, i

j while1
exit1: 