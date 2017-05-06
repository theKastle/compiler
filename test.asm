.data 
 a: .word 0 
 b: .word 0 
  
 .text  
 addi $t0, $zero, 2 
 sw $t0, a
addi $t0, $zero, 7 
 sw $t0, b

addi $t7, $zero, 7
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $sp, $sp, -4  
sw $t2, 0($sp)

addi $t7, $zero, 5
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $zero, $t2
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
add $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t0, 0($sp) 
 addi $sp, $sp, 4

li $v0, 1
 add $a0, $zero, $t0
 syscall

lw $t7, b
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $zero, $t2
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $zero, $t2
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t0, 0($sp) 
 addi $sp, $sp, 4

li $v0, 1
 add $a0, $zero, $t0
 syscall

addi $t7, $zero, 1
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $zero, $t2
addi $sp, $sp, -4  
sw $t2, 0($sp)

addi $t7, $zero, 4
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $zero, $t2
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
add $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)

lw $t7, a
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
add $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $zero, $t2
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t0, 0($sp) 
 addi $sp, $sp, 4

li $v0, 1
 add $a0, $zero, $t0
 syscall

lw $t7, a
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $sp, $sp, -4  
sw $t2, 0($sp)

lw $t7, b
addi $sp, $sp, -4  
sw $t7, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
sub $t2, $zero, $t2
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t1, 0($sp) 
 addi $sp, $sp, 4
lw $t0, 0($sp) 
 addi $sp, $sp, 4
mul $t2, $t0, $t1 
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t2, 0($sp) 
 addi $sp, $sp, 4
addi $sp, $sp, -4  
sw $t2, 0($sp)
lw $t0, 0($sp) 
 addi $sp, $sp, 4

li $v0, 1
 add $a0, $zero, $t0
 syscall
