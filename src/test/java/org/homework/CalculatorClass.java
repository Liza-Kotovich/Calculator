package org.homework;

import org.homework.tests.BaseCalculatorTestClass;

public class CalculatorClass extends BaseCalculatorTestClass {
    public static void main(String[] args) {
    }

    BaseCalculatorTestClass baseCalculatorClass = new BaseCalculatorTestClass();

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }


}
