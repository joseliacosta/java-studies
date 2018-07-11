package general;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
//        Prime Factors Exercise

//        Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.

//        For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        List<Integer> primeFactors = new ArrayList<>();
        if(userNumber != 0) {
            for(int index = 1; index < userNumber; index++) {
                if(userNumber % index == 0) {
                    primeFactors.add(index);
                }
            }
        }
        if(primeFactors.size() > 0) {
            for(int counter = 1; counter < primeFactors.size(); counter++) {
                if(counter != primeFactors.size() - 1){
                    System.out.print(primeFactors.get(counter)+ ", ");
                } else {
                    System.out.print(primeFactors.get(counter)+ ".");
                }
            }
        }



    }
}
