package com.loockcafe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nickhung on 2017/5/8.
 * Add a new comment 
 */
public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        this.cal = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() throws Exception {
        int a = 5;
        int b = 3;
        int result = this.cal.add(a, b);
        int expected = 8;
        assertEquals(expected, result);
    }

    @Test
    public void minus() throws Exception {
        int a = 5;
        int b = 3;
        int result = this.cal.minus(a, b);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void multiply() throws Exception {
        int a = 5;
        int b = 3;
        int result = this.cal.multiply(a, b);
        int expected = 15;
        assertEquals(expected, result);
    }

    @Test
    public void divide() throws Exception {
        int a = 6;
        int b = 3;
        int result = this.cal.divide(a, b);
        int expected = 2;
        assertEquals(expected, result);
    }

}