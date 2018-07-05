package triangles;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        /*
            Draw a vertical line

            Given a number n, print n lines, each with one asterisks
            Example when n=3:
            *
            *
            *
        */

        System.out.println("Enter the quantity of lines that you want: ");
        Scanner scanner = new Scanner(System.in);
        int linesQtde = scanner.nextInt();

        if(linesQtde > 0) {
            for(int index = 0; index < linesQtde; index++) {
                System.out.println("*");
            }
        } else {
            System.out.println("Try a number greater than 0");
        }

    }
}
