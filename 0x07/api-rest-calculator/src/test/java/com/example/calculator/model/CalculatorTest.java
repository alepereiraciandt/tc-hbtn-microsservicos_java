package com.example.calculator.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Sum two numbers")
    void sumTest() {
        Double expected = 42.0;

        Double result = calculator.sum(20.0, 22.0);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Sub two numbers")
    void subTest() {
        Double expected = 2.0;

        Double result = calculator.sub(22.0, 20.0);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Divide two numbers")
    void divideTest() {
        Double expected = 11.0;

        Double result = calculator.divide(22.0, 2.0);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Factorial")
    void factorialTest() {
        Integer expected = 120;

        Integer result = calculator.factorial(5);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Convert Integer to Binary")
    void integerToBinaryTest() {
        Integer expected = 101;

        Integer result = calculator.integerToBinary(5);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Convert Integer to Hexadecimal")
    void integerToHexadecimalTest() {
        String expected = "5";

        String result = calculator.integerToHexadecimal(5);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Calculate days between birth date")
    void calculeDayBetweenDateTest() throws ParseException {
        int expected = -3800;
        LocalDate date1 = LocalDate.of(1991, 02, 25);
        LocalDate date2 = LocalDate.now();



        int result = calculator.calculeDayBetweenDate(date1, date2);

        assertEquals(expected, result);
    }
}