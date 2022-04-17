package org.example.tests;

import org.example.CalculatorClass;
import org.example.DataProviders;
import org.example.Retry;
import org.example.tests.BaseCalculatorTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends BaseCalculatorTestClass {

    CalculatorClass calculatorClass = new CalculatorClass();

    @Test(dataProvider = "arrayForDivisionTest", dataProviderClass = DataProviders.class, retryAnalyzer = Retry.class,
            description = "division test", priority = 2, invocationCount = 4, threadPoolSize = 2)
    public void divisionTest(int a, int b, int expectedResult) {
        Assert.assertEquals(calculatorClass.division(a, b), expectedResult);
    }
}
