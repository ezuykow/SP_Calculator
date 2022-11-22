package ru.ezuykow.calculator.exceptions;

public class DivisionByZeroException extends RuntimeException{

    public DivisionByZeroException() {
        super("Division by zero!");
    }
}
