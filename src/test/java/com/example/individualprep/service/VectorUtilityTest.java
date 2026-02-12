package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorUtilityTest {

    VectorUtility service = new VectorUtility();

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
