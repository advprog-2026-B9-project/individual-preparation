package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArithmeticUtilityTest {

    ArithmeticUtility service = new ArithmeticUtility();

    @Test
    void testMultiplyTwoPositives(){
        double firstPositive = 2.0, secondPositive = 2.5;
        double expected = firstPositive * secondPositive;
        double result = service.multiply(firstPositive, secondPositive);

        assertEquals(expected, result);
    }

    @Test
    void testMultiplyTwoNegatives(){
        double firstNegative = -3.0, secondNegative = 0.5;
        double expected = firstNegative * secondNegative;
        double result = service.multiply(firstNegative, secondNegative);

        assertEquals(expected, result);
    }

    @Test
    void testMultiplyPositiveAndNegative(){
        double positive = 5.0, negative = -3.5;
        double expected = positive * negative;
        double result = service.multiply(positive, negative);

        assertEquals(expected, result);
    }

    @Test
    void testMultiplyPositiveAndZero(){
        double positive = 67.0;
        double expected = 0.0;
        double result = service.multiply(positive, 0.0);

        assertEquals(expected, result);
    }

    @Test
    void testMultiplyNegativeAndZero(){
        double negative = -39.0;
        double expected = 0.0;
        double result = service.multiply(negative, 0.0);

        assertEquals(expected, result);
    }

    @Test
    void testMultiplyNegativeZero(){
        double firstOperand = 5.0;
        double expected = 0.0;
        double result = service.multiply(firstOperand, -0.0);

        assertEquals(expected, result);
    }

    @Test
    void testDivide() {
        double result = service.divide(10.0, 5.0);
        assertEquals(2.0, result);
    }

    @Test
    void testDivideZeroByPositive() {
        double result = service.divide(0.0, 5.0);
        assertEquals(0.0, result);
    }

    @Test
    void testDividePositiveByZero() {
        double result = service.divide(5.0, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testDivideNegativeByZero() {
        double result = service.divide(-5.0, 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    void testZeroDividedByZero() {
        double result = service.divide(0.0, 0.0);
        assertTrue(Double.isNaN(result));
    }

    @Test
    void testExponentPositiveBaseAndPower() {
        double result = service.exponent(2,3);
        assertEquals(8.0, result);
    }

    @Test
    void testExponentZeroPower() {
        double result = service.exponent(2.0, 0);
        assertEquals(1.0, result);
    }

    @Test
    void testExponentNegativeBase() {
        double resultOdd = service.exponent(-2.0,3);
        assertEquals(-8.0, resultOdd);

        double resultEven = service.exponent(-2.0,2);
        assertEquals(4.0, resultEven);
    }

    @Test
    void testExponentBaseZero() {
        double result = service.exponent(0.0, 2);
        assertEquals(0.0, result);
    }

    @Test
    void testExponentNegativePower() {
        double result = service.exponent(2.0, -2);
        assertEquals(0.25, result);
    }
}