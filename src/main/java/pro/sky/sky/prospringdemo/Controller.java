package pro.sky.sky.prospringdemo;


import com.sun.source.tree.BreakTree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int result = service.sum(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        int result = service.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = service.multiply(num1,num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        int result = service.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
    }
