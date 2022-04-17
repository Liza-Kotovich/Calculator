package org.example.tests;

import org.example.CalculatorClass;
import org.example.DataProviders;
import org.example.Retry;
import org.example.tests.BaseCalculatorTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseCalculatorTestClass {

    CalculatorClass calculatorClass = new CalculatorClass();

    @Test(dataProvider = "arrayForSubtractionTest", dataProviderClass = DataProviders.class, retryAnalyzer = Retry.class,
            description = "subtraction test", priority = 4, invocationCount = 4, threadPoolSize = 2)
    public void subtractionTest(int a, int b, int expectedResult) {
        Assert.assertEquals(calculatorClass.subtraction(a, b), expectedResult);
    }
}
