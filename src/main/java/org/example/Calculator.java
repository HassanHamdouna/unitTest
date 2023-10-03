package org.example;

public class Calculator {

    public float divide(float a, float b){
        if (b == 0 || a == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

}

