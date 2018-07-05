package triangles;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

    /*

    Draw a horizontal line
    Given a number n, print n asterisks on one line.
    Example when n=8:
    ********

    */

        System.out.println("Enter the quantity of asterisk that you want: ");
        Scanner scanner = new Scanner(System.in);
        int asteriskQtde = scanner.nextInt();

        if(asteriskQtde > 0) {
            for(int index = 0; index < asteriskQtde; index++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Try a number greater than 0");
        }

    }
}


