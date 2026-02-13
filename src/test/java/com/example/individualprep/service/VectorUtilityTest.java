package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorUtilityTest {

    VectorUtility service = new VectorUtility();

    @Test
    void testAddVectors() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] expected = {5.0, 7.0, 9.0};

        double[] result = service.add(v1, v2);
        assertEquals(expected.length, result.length);

        for(int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i],0.0001);
        }
    }

    @Test
    void testAddVectorsDifferentLength() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        try{
            service.add(v1, v2);
        }
        catch(IllegalArgumentException e) {
            assertEquals("Vector lengths must be equal", e.getMessage());
        }
    }

    @Test
    void testAddNegativeVectors() {
        double[] v1 = {-1.0, -2.0};
        double[] v2 = {-3.0, 4.0};
        double[] expected = {-4.0, 2.0};

        double[] result = service.add(v1, v2);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i], 0.0001);
        }
    }
    
    @Test
    void testSubtractVectors() {
        double[] vector1 = new double[]{1.0, 2.0, 3.0};
        double[] vector2 = new double[]{1.0, 2.0, 3.0};

        double[] resultVector = service.subtract(vector1, vector2);
        double[] expectedVector = new double[]{0.0, 0.0, 0.0};

        for (int index = 0; index < resultVector.length; index++){
            assertEquals(expectedVector[index], resultVector[index]);
        }
    }

    @Test
    void testSubtractDifferentLengths() {
        double[] vector1 = new double[]{1.0, 2.0, 3.0};
        double[] vector2 = new double[]{1.0, 2.0};

        try{
            service.subtract(vector1, vector2);
        }
        catch(IllegalArgumentException e) {
            assertEquals("Vector lengths must be equal", e.getMessage());
        }
    }

    @Test
    void testMultiplyWithPositive(){
        double[] vector = new double[]{1.0, 2.0, 3.0};
        int scalar = 3;

        double[] resultVector = service.multiply(vector, scalar);
        double[] expectedVector = new double[]{3.0, 6.0, 9.0};

        for (int index = 0; index < resultVector.length; index++){
            assertEquals(expectedVector[index], resultVector[index]);
        }
    }

    @Test
    void testMultiplyWithNegative(){
        double[] vector = new double[]{1.0, 2.0, 3.0};
        int scalar = -3;

        double[] resultVector = service.multiply(vector, scalar);
        double[] expectedVector = new double[]{-3.0, -6.0, -9.0};

        for (int index = 0; index < resultVector.length; index++){
            assertEquals(expectedVector[index], resultVector[index]);
        }
    }

    @Test
    void testMultiplyWithZero(){
        double[] vector = new double[]{1.0, 2.0, 3.0};
        int scalar = 0;

        double[] resultVector = service.multiply(vector, scalar);
        double[] expectedVector = new double[]{0.0, 0.0, 0.0};

        for (int index = 0; index < resultVector.length; index++){
            assertEquals(expectedVector[index], resultVector[index]);
        }
    }

    @Test
    void testDotProductNormal() {
        double[] v1 = new double[]{1.0, 2.0, 3.0};
        double[] v2 = new double[]{4.0, 5.0, 6.0};

        double result = service.dotProduct(v1, v2);

        assertEquals(32.0, result);
    }

    @Test
    void testDotProductNegativeValues() {
        double[] v1 = new double[]{-1.0, 2.0, -3.0};
        double[] v2 = new double[]{4.0, -5.0, 6.0};

        double result = service.dotProduct(v1, v2);

        assertEquals(-32.0, result);
    }

    @Test
    void testDotProductDifferentLengths() {
        double[] v1 = new double[]{1.0, 2.0};
        double[] v2 = new double[]{1.0, 2.0, 3.0};

        try {
            service.dotProduct(v1, v2);
        }
        catch (IllegalArgumentException e) {
            assertEquals("Vector lengths must be equal", e.getMessage());
        }
    }
}
