# compiler

# 4 BASIC COMMANDS:
  1. java -jar jflex-1.6.1.jar AVSL.jflex
  2. java -jar java-cup-11b.jar -interface -parser parser AVSL.cup
  3. javac -cp java-cup-11b-runtime.jar;. *.java
  4. java -cp java-cup-11b-runtime.jar;. Compiler test.avc test.asm
