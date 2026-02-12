package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}