package com.education.hszg.bmi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.Parameters;

import junitparams.JUnitParamsRunner;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBubbleSort {
    
    private BubbleSort bubbleSort;

    @Before
    public void before() {
        bubbleSort = new BubbleSort();
    }

    @After
    public void after() {
        bubbleSort = null;
    }

    @Test
    @Parameters({
        "1-2-3-4-5-6-7  2,  3,  1-2-3-4-5-6-7",
        "1-2-3-4-5-6-7  0,  6,  7-2-4-3-5-6-1",
        "1-2-3-4-5-6-7  4,  4,  1-2-3-4-5-6-7",
        "1-2-3-4-5-6-7  6,  0,  7-2-3-4-5-6-1",


    })
    public void testswap() {
        
    ;
        
    }

    @Parameters({
        "7-7-7-7-7-7,       7-7-7-7-7-7",
        "9,8,7,6,5,4        4,5,6,7,8,9",
        "1-2-3-4-5-6,       1-2-3-4-5-6",
        "7-7-7-1234567-7,    7-7-7-7-1234567",
        "7-7-7-4-7,         4-7-7-7-7",
        "7,                 7",


    })
    public void testSort() {
        
        
    }
}
