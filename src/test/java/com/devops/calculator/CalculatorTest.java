package com.devops.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test Addition")
    void testAdd() {
        assertEquals(10.0, calculator.add(6.0, 4.0), 0.0001);
        assertEquals(-2.0, calculator.add(-6.0, 4.0), 0.0001);
    }

    @Test
    @DisplayName("Test Subtraction")
    void testSubtract() {
        assertEquals(2.0, calculator.subtract(6.0, 4.0), 0.0001);
        assertEquals(-10.0, calculator.subtract(-6.0, 4.0), 0.0001);
    }

    @Test
    @DisplayName("Test Multiplication")
    void testMultiply() {
        assertEquals(24.0, calculator.multiply(6.0, 4.0), 0.0001);
        assertEquals(0.0, calculator.multiply(0.0, 4.0), 0.0001);
    }

    @Test
    @DisplayName("Test Division")
    void testDivide() {
        assertEquals(2.5, calculator.divide(10.0, 4.0), 0.0001);
    }

    @Test
    @DisplayName("Test Division by Zero throws Exception")
    void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10.0, 0.0)
        );
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    @DisplayName("Test Power Calculation")
    void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.0001);
    }

    @Test
    @DisplayName("Test Modulus")
    void testModulus() {
        assertEquals(1.0, calculator.modulus(10.0, 3.0), 0.0001);
    }
}
