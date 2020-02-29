# Moving Average
Data structure that can provide the moving average of the last N elements added

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

Minimum Requirements
- Provide a separate interface (IE interface/trait) with documentation for the data structure
- Provide an implementation for the interface
- Provide any additional explanation about the interface and implementation in a README file.

---
The MovingAverage interface defines the interface of the data structure with 3 methods-

    void addNumber(double num);
    double getAverage();
    double getElement(int indexFromStart);
    
The MovingAverageUsingList is an implementation for the interface using ArrayList for storing the elements. The time complexity of the methods are-

    void addNumber(double num)              -   O(1)
    double getAverage()                     -   O(1)
    double getElement(int indexFromStart)   -   O(1)

The MovingAverageTest is a JUnit to test the features of the interface.
