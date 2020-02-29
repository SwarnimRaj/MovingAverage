package com.paytm;

import com.paytm.average.MovingAverage;
import com.paytm.average.MovingAverageUsingList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MovingAverageTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private MovingAverage movingAverage;
    private int N = 3;

    @Before
    public void setUp() {
        movingAverage = new MovingAverageUsingList(N);
    }

    @Test
    public void getAverage() {
        double delta = 0.0001;
        movingAverage.addNumber(2);
        movingAverage.addNumber(3);
        movingAverage.addNumber(4);
        Assert.assertEquals((2 + 3 + 4D) / N, movingAverage.getAverage(), delta);
        movingAverage.addNumber(5);
        double expectedAvg = (3 + 4 + 5) / 3D;
        Assert.assertEquals(expectedAvg, movingAverage.getAverage(), delta);
    }

    @Test
    public void getElement() {
        movingAverage.addNumber(5);
        Assert.assertEquals(5.0, movingAverage.getElement(1), 0.0);
    }

    @Test
    public void getElementThrowsExceptionWhenEmpty() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Not enough elements have been added");
        movingAverage.getElement(1);
    }
}