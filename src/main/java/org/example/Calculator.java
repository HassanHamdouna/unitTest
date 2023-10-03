package org.example;

public class Calculator {

    public Float divide(Float a, Float b) throws  ArithmeticException{
        if (b == 0 || a == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

}

