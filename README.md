# compiler

# 4 BASIC COMMANDS:
  1. java -jar jflex-1.6.1.jar AVSL.jflex
  2. java -jar java-cup-11b.jar -interface -parser parser AVSL.cup
  3. javac -cp java-cup-11b-runtime.jar;. *.java
  4. java -cp java-cup-11b-runtime.jar;. Compiler test.avc test.asm

# Test cases:
1. While loops with nest while loop
```
begin
    a = 7;
    b = 0;
    c = 11;
    i = 2;
    while i do
    begin
        j = 2;
        while j do
        begin
            write j;
            j = j - 1;
        end
        write a;
        i = i - 1;
    end
end
```

2. Write statement with expression
```
begin
    write 12;
    write a;
    write (12 + a) + 12;
end
```

3. Factorial
```
begin
    read n;
    fact = 1;
    while n do
    begin
        fact = fact * n;
        n = n - 1;
    end
    write fact;
end
```