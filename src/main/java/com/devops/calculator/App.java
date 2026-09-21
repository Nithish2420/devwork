package com.devops.calculator;

/**
 * Main application entry point for the Calculator App.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   DevOps Lab: Java Calculator App      ");
        System.out.println("=========================================");
        
        Calculator calc = new Calculator();
        
        double num1 = 15.0;
        double num2 = 5.0;

        System.out.println("Sample Calculations for inputs (" + num1 + ", " + num2 + "):");
        System.out.println("Addition:       " + num1 + " + " + num2 + " = " + calc.add(num1, num2));
        System.out.println("Subtraction:    " + num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
        System.out.println("Division:       " + num1 + " / " + num2 + " = " + calc.divide(num1, num2));
        System.out.println("Power:          " + num1 + " ^ " + num2 + " = " + calc.power(num1, num2));
        System.out.println("Modulus:        " + num1 + " % " + num2 + " = " + calc.modulus(num1, num2));
        System.out.println("=========================================");
        System.out.println("Application executed successfully!");
    }
}
