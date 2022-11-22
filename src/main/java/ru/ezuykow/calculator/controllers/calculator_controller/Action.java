package ru.ezuykow.calculator.controllers.calculator_controller;

public enum Action {
    SUM('+'),
    DIVISION('/'),
    MULTIPLY('x'),
    DIFFERENCE('-');

    private char sign;

    Action(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
}
