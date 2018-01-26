package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

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

    @RequestMapping ("/bonus")
    public String bonus() {
        Scanner input = new Scanner(System.in);
        String output2 = "";
        int count7 = 0, count17 = 0, count23 = 0;
        System.out.println("The last number is");
        int lastNum = input.nextInt();
        for (int i = 1; i <= lastNum; i++) {
            if (i % 7 == 0)
                count7++;
            if (i % 17 == 0)
                count17++;
            if (i % 23 == 0)
                count23++;
            output2 =  fizzBuzz()+"the number of multiples of 7 are " + String.valueOf(count7) + "</br>" + "the number of multiples of 17 are" + String.valueOf(count17) + "</br>" + "the number of multiples of 23 are" + String.valueOf(count23) + "</br>";


        }
        return output2;
    }
}

