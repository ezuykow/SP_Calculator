package ru.ezuykow.calculator.controllers.calculator_controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.ezuykow.calculator.exceptions.DivisionByZeroException;

@ControllerAdvice
public class CalculatorExceptionController {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<Object> emptyParameterException(MissingServletRequestParameterException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DivisionByZeroException.class)
    public ResponseEntity<Object> divisionByZeroException(DivisionByZeroException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
