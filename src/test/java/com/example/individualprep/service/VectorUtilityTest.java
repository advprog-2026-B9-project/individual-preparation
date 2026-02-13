package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorUtilityTest {

    VectorUtility service = new VectorUtility();

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
}
