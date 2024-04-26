package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int calculator(int a, int b, char operation) {
        if (operation == '*')
            return a * b;
        else if (operation == '/')
            return a / b;
        else if (operation == '^')
            return (int)Math.pow(a, b);
        else
            throw new java.lang.Error("Invalid operation!");
    }
}