package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/sum")
    public double sum(@RequestParam(value = "n1") double n1,
                      @RequestParam(value = "n2") double n2){
        return n1 + n2;
    }

    @RequestMapping("/sum/{n1}/{n2}")
    public double sumByPath(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        return n1 + n2;
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam(value = "n1") double n1,
                           @RequestParam(value = "n2") double n2){
        return n1 - n2;
    }

    @RequestMapping("/subtract/{n1}/{n2}")
    public double subtractByPath(@PathVariable("n1") double n1,
                                 @PathVariable("n2") double n2){
        return n1 - n2;
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam(value = "n1") double n1,
                           @RequestParam(value = "n2") double n2){
        return n1 * n2;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam(value = "n1") double n1,
                           @RequestParam(value = "n2") double n2){
        return n1 / n2;
    }


}
