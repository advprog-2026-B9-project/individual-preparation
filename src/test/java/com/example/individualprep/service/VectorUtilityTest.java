package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
