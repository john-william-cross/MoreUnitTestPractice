package com.johncross;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesImplTest {
    private Multiples classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new MultiplesImpl();
    }

    @Test
    public void hopefullyDoesMultiplication() {

        MultiplesImpl multiples = new MultiplesImpl();
        String result = multiples.doesMultiplication(54);
        assertEquals("54 multiplied by ten is 540. 54 is an even number.", result);
    }
}