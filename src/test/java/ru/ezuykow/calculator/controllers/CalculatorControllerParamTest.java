package ru.ezuykow.calculator.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.ezuykow.calculator.services.CalculatorService;
import ru.ezuykow.calculator.services.calculator_service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorControllerParamTest {

    private CalculatorService calculatorService;

    @BeforeEach
    public void setup() {
        calculatorService = new CalculatorServiceImpl();
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(1d, 5d),
                Arguments.of(0.5d, -3d)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnRightSum(double a, double b) {
        double actual = a + b;
        double expected = calculatorService.sum(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnRightDifferense(double a, double b) {
        double actual = a - b;
        double expected = calculatorService.difference(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnRightMultiply(double a, double b) {
        double actual = a * b;
        double expected = calculatorService.multiply(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnRightDivision(double a, double b) {
        double actual = a / b;
        double expected = calculatorService.division(a, b);
        assertEquals(expected, actual);
    }
}