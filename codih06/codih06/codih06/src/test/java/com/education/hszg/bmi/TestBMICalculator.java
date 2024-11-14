package com.education.hszg.bmi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.Parameters;

import junitparams.JUnitParamsRunner;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBMICalculator {
    
    private BMICalculator bmiCalculator;

    @Before
    public void before() {
        bmiCalculator = new BMICalculator();
    }

    @After
    public void after() {
        bmiCalculator = null;
    }

    @Test
    @Parameters({
        "85.123,        1.78,       26.8",
        "-5.5,          1.24,       0.0",
        "233,           1.24,       0.0",
        "85.7,          0.78,       0.0",
        "85,            1.78,        26.8",

    })
    public void TestCalculateBMI(double weightInKG, double heightInMeters, double bmi) {
        
        assertEquals(bmi, bmiCalculator.calculateBMI(weightInKG, heightInMeters), 0.1);
        
    }

    @Parameters({
        "85.123,        1.78,       Gym",
        "-5.5,          1.24,       McDonalds",
        "233,           1.24,       McDonalds",
        "85.7,          0.78,       McDonalds",
        "66,            820.7,      McDonalds",
        "67.72,         1.8,        McDonalds",
        "77.44,         1.8,        Healthy",
        "78.08,         1.8,        Gym",

    })
    public void testGetBMIRecommendation(double weightInKG, double heightInMeters, double bmi) {
        
        assertEquals(bmi, bmiCalculator.calculateBMI(weightInKG, heightInMeters), 0.1);
        
    }
}
