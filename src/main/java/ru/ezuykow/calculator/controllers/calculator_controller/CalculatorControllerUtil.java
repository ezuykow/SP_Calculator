package ru.ezuykow.calculator.controllers.calculator_controller;

public class CalculatorControllerUtil {

    public static String makeStringAnswer(double a, double b, Action action, double result) {
        return String.format("%.2f %s %.2f = %.2f", a, action.getSign(), b, result);
    }
}
