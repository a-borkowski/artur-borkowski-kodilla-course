package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    public double doublesub(double a, double b){
        double result = a - b;
        display.displayValue(result);
        return result;
    }

    public double doublemul(double a, double b){
        double result = a * b;
        display.displayValue(result);
        return result;
    }

    public double doublediv(double a, double b) {
        double result = a / b;
        display.displayValue(result);
        return result;
    }
}