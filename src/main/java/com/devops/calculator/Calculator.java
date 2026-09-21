package com.devops.calculator;

/**
 * Calculator class providing arithmetic operations.
 */
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double modulus(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulus by zero is not allowed.");
        }
        return a % b;
    }
}
