package com.paytm.average;

public interface MovingAverage {
    void addNumber(double num);

    double getAverage();

    double getElement(int indexFromStart);
}
