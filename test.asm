.data 
 n: .word 0 
 fact: .word 0 
  
 .text  
 
 li $v0, 5 
 syscall 
 sw $v0, n 
 addi $t0, $zero, 1 
 sw $t0, fact
while0:

lw $t0, n

blt $t0, 1, exit0

lw $t7, fact
addi $sp, $sp, -4  
sw $t7, 0($sp)

lw $t7, n
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
mul $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $t0, $t2, 0 
 sw $t0, fact

lw $t7, n
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
 sw $t0, n

j while0
exit0: 
lw $t7, fact
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t0, 0($sp) 
 addi $sp, $sp, 4

li $v0, 1
 add $a0, $zero, $t0
 syscall
