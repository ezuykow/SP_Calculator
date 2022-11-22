package ru.ezuykow.calculator.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ezuykow.calculator.exceptions.DivisionByZeroException;
import ru.ezuykow.calculator.services.CalculatorService;
import ru.ezuykow.calculator.services.calculator_service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private CalculatorService calculatorService;
    private double a, b, c, d;

    @BeforeEach
    public void setup() {
        calculatorService = new CalculatorServiceImpl();
        a = 1d;
        b = 5d;
        c = 0.5d;
        d = -3d;
    }
    @Test
    void shouldReturnRightSum() {
        double actual = a + b;
        double expected = calculatorService.sum(a, b);
        assertEquals(expected, actual);

        actual = c + d;
        expected = calculatorService.sum(c, d);
        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnRightDifference() {
        double actual = a - b;
        double expected = calculatorService.difference(a, b);
        assertEquals(expected, actual);

        actual = c - d;
        expected = calculatorService.difference(c, d);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnRightMultiply() {
        double actual = a * b;
        double expected = calculatorService.multiply(a, b);
        assertEquals(expected, actual);

        actual = c * d;
        expected = calculatorService.multiply(c, d);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnRightDivision() {
        double actual = a / b;
        double expected = calculatorService.division(a, b);
        assertEquals(expected, actual);

        actual = c / d;
        expected = calculatorService.division(c, d);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowDivisionByZeroException() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.division(a, 0));
    }
}