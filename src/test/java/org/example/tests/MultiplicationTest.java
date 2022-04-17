package org.example.tests;

import org.example.CalculatorClass;
import org.example.DataProviders;
import org.example.Retry;
import org.example.tests.BaseCalculatorTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseCalculatorTestClass {
    CalculatorClass calculatorClass = new CalculatorClass();

    @Test(dataProvider = "arrayForMultiplicationTest", dataProviderClass = DataProviders.class, retryAnalyzer = Retry.class,
            description = "multiplication test", priority = 3, invocationCount = 4, threadPoolSize = 2)
    public void multiplicationTest(int a, int b, int expectedResult) {
        Assert.assertEquals(calculatorClass.multiplication(a, b), expectedResult);
    }
}
