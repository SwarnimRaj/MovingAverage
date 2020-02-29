package com.paytm.average;

import java.util.ArrayList;
import java.util.List;

public class MovingAverageUsingList implements MovingAverage {
    private List<Double> allNumbers = new ArrayList<>();
    private int N;
    private double average;
    private double total;
    private double head;

    public MovingAverageUsingList(int n) {
        N = n;
    }

    @Override
    public void addNumber(double num) {
        allNumbers.add(num);
        int size = allNumbers.size();
        if (size < N) {
            total = total + num;
            average = total / size;
        } else {
            total = total + num - head;
            head = allNumbers.get(size - N);
            average = total / N;
        }
    }

    @Override
    public double getAverage() {
        return average;
    }

    @Override
    public double getElement(int indexFromStart) {
        if (indexFromStart > allNumbers.size() || indexFromStart < 1)
            throw new RuntimeException("Not enough elements have been added");
        return allNumbers.get(indexFromStart - 1);
    }
}
