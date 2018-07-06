package triangles;

import java.util.Scanner;

public class ex3 {
    /*
        Draw a right triangle

        Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
        Example when n=3:
        *
        **
        ***
     */

    public static void main(String[] args) {
        System.out.println("Enter the size of your right triangle: ");
        Scanner scanner = new Scanner(System.in);
        int triangleHeight = scanner.nextInt();

        if(triangleHeight > 0) {
            for(int lines = 0; lines < triangleHeight; lines++) {
                for(int asterisks = 0; asterisks <= lines; asterisks++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }

    }


}
