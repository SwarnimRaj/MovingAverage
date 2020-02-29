package com.paytm;

import com.paytm.average.MovingAverage;
import com.paytm.average.MovingAverageUsingList;

public class Application {
    public static void main(String[] args) {
        int N = 3;
        System.out.println("Moving Average with sliding window size " + N);
        MovingAverage movingAverage = new MovingAverageUsingList(N);
        int[] array = new int[]{2, 3, 4, 1, 2, -3, 0};
        for (int num : array) {
            movingAverage.addNumber(num);
            System.out.println(movingAverage.getAverage());
        }
        System.out.println(movingAverage.getElement(1));
    }
}
