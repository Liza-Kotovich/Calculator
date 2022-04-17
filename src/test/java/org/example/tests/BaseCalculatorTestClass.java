package org.example.tests;


import org.example.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)

public class BaseCalculatorTestClass {


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Tne test method is started");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Tne test method is finished");
    }
}
