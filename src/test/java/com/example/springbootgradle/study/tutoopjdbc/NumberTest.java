package com.example.springbootgradle.study.tutoopjdbc;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {
    @org.junit.jupiter.api.Test
    void testPrime() {
        assertFalse(CMath.isPrime(1));
        assertTrue(CMath.isPrime(2));
        assertTrue(CMath.isPrime(3));
    }
}