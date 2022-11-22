package ru.ezuykow.calculator.services.calculator_service;

import ru.ezuykow.calculator.exceptions.DivisionByZeroException;

public class CalculatorServiceUtil {
    public static final double DELTA = 10e-8;

    static void throwExceptionIfZero(double target) {
        if (Math.abs(target) - 0 < DELTA) {
            throw new DivisionByZeroException();
        }
    }
}
