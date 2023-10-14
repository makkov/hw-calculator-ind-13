package com.example.hwcalculatorind13.service;

import com.example.hwcalculatorind13.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void greeting_success() {
        //Подготовка ожидаемого результата
        String expectedMessage = "Добро пожаловать в калькулятор!";

        //Начало теста
        String actualMessage = calculatorService.greeting();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void plus_success() {
        //Подготовка входных данных
        int num1 = 3;
        int num2 = 6;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success2() {
        //Подготовка входных данных
        int num1 = 58;
        int num2 = 4;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success() {
        //Подготовка входных данных
        int num1 = 5;
        int num2 = 3;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "-", String.valueOf(num1 - num2));

        //Начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success() {
        //Подготовка входных данных
        int num1 = 33;
        int num2 = 3;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "*", String.valueOf(num1 * num2));

        //Начало теста
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {
        //Подготовка входных данных
        int num1 = 55;
        int num2 = 4;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "/", String.valueOf((double) num1 / num2));

        //Начало теста
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withException() {
        //Подготовка входных данных
        int num1 = 45;
        int num2 = 0;

        //Подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя!";

        //Начало теста
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.divide(num1, num2)
        );
        assertEquals(expectedMessage, exception.getMessage());
    }
}
