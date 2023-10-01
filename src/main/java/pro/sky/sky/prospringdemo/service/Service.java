package pro.sky.sky.prospringdemo.service;

import pro.sky.sky.prospringdemo.service.API.CalculatorInterface;

@org.springframework.stereotype.Service

public class Service implements CalculatorInterface {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String sum(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
