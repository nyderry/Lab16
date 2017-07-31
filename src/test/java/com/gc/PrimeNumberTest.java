package com.gc;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeNumberTest {
    @Test
    public void test1() throws Exception {
        PrimeNumber primeNumberNumber = new PrimeNumber();
        int expected = 3;
        int actual = primeNumberNumber.primeNumber(2);
        assertEquals("Test 1 failed", expected, actual);

    }

    @Test
    public void test2() throws Exception {
        PrimeNumber primeNumberNumber = new PrimeNumber();
        int expected = 5;
        int actual = primeNumberNumber.primeNumber(3);
        assertEquals("Test 2 failed", expected, actual);

    }

    @Test
    public void test3() throws Exception {
        PrimeNumber primeNumberNumber = new PrimeNumber();
        int expected = 7;
        int actual = primeNumberNumber.primeNumber(4);
        assertEquals("Test 3 failed", expected, actual);

    }

    @Test
    public void test4() throws Exception {
        PrimeNumber primeNumberNumber = new PrimeNumber();
        int expected = 11;
        int actual = primeNumberNumber.primeNumber(5);
        assertEquals("Test 4 failed", expected, actual);
    }
}
