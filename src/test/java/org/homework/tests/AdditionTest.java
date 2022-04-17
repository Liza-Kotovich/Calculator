package org.homework.tests;

import org.homework.CalculatorClass;
import org.homework.DataProviders;
import org.homework.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest extends BaseCalculatorTestClass {

    CalculatorClass calculatorClass = new CalculatorClass();

    @Test(dataProvider = "arrayForAdditionTest", dataProviderClass = DataProviders.class, retryAnalyzer = Retry.class,
            description = "addition test", priority = 1, invocationCount = 4, threadPoolSize = 2)
    public void additionTest(int a, int b, int expectedResult) {
        Assert.assertEquals(calculatorClass.addition(a, b), expectedResult);
    }

}
