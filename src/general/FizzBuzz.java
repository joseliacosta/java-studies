package general;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {


//        Create a FizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//        Instead of numbers divisible by five print "Buzz".
//        Instead of numbers divisible by three and five print "FizzBuzz".


        System.out.println("FIZZBUZZ EXERCISE!");
        System.out.println("-------------------------------------");


        for(int counter = 1; counter <= 100; counter++) {
            if(counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(counter % 3 == 0) {
                System.out.println("Fizz");
            } else if(counter % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }
        }

    }
}
