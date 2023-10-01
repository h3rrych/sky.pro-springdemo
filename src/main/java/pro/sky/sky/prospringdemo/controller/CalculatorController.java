package pro.sky.sky.prospringdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.sky.prospringdemo.service.Service;

@RestController

public class CalculatorController {
    private final Service service;

    public CalculatorController(Service service) {
        this.service = service;
    }

    @GetMapping(path = "/calculator")
    public String welcome() {
        return service.welcome();
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
       return service.sum(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return service.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return service.divide(num1, num2);
    }
}
