package com.superwes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrunkElfPathThingyTest {

    private DrunkElfPathThingy testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new DrunkElfPathThingy();
    }

    @Test
    public void countVisits_emptyReturns1ForHouseSantasOn() throws Exception {
        int result = testObject.countVisits("");
        assertEquals(1, result);
    }
}