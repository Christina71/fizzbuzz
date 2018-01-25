package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzz {

    @RequestMapping("/yes")
    public String fizzBuzz() {
        String output = "";
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FIZZBUZZ");
                output += "FIZZBUZZ" + "<br>";
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
                output += "FIZZ" + "<br>";
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
                output += "BUZZ" + "<br>";

            } else {
                System.out.println(i);
                output += i + "<br>";
            }
        }

             return output;
    }
}
