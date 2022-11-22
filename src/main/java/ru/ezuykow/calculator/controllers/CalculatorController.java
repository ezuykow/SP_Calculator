package ru.ezuykow.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ezuykow.calculator.controllers.calculator_controller.Action;
import ru.ezuykow.calculator.services.CalculatorService;

import static ru.ezuykow.calculator.controllers.calculator_controller.CalculatorControllerUtil.makeStringAnswer;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String index() {
        return "Welcome in the Calculator App!";
    }

    @GetMapping("/sum")
    public String sum(@RequestParam("num1") double a,
                      @RequestParam("num2") double b) {
        double result = calculatorService.sum(a, b);
        return makeStringAnswer(a, b, Action.SUM, result);
    }

    @GetMapping("/minus")
    public String difference(@RequestParam("num1") double a,
                             @RequestParam("num2") double b) {
        double result = calculatorService.difference(a, b);
        return makeStringAnswer(a, b, Action.DIFFERENCE, result);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") double a,
                           @RequestParam("num2") double b) {
        double result = calculatorService.multiply(a, b);
        return makeStringAnswer(a, b, Action.MULTIPLY, result);
    }

    @GetMapping("/div")
    public String division(@RequestParam("num1") double a,
                           @RequestParam("num2") double b) {
        double result = calculatorService.division(a, b);
        return makeStringAnswer(a, b, Action.DIVISION, result);
    }
}
