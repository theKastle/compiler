# compiler

# 4 BASIC COMMANDS:
  1. java -jar jflex-1.6.1.jar CFlat.jflex
  2. java -jar java-cup-11b.jar -interface -parser Parser CFlat.cup
  3. javac -cp java-cup-11b-runtime.jar;. *.java
  4. java -cp ;. Compiler test.cf test.s
