package org.homework;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object[][] arrayForAdditionTest() {
        return new Object[][]{
                {5, 3, 8},
                {6, 10, 16},
        };
    }

    @DataProvider
    public static Object[][] arrayForSubtractionTest() {
        return new Object[][]{
                {10, 8, 2},
                {12, 6, 6},
        };
    }

    @DataProvider
    public static Object[][] arrayForMultiplicationTest() {
        return new Object[][]{
                {7, 7, 49},
                {6, 8, 48},
        };
    }

    @DataProvider
    public static Object[][] arrayForDivisionTest() {
        return new Object[][]{
                {8, 2, 4},
                {15, 3, 5},
        };
    }
}
