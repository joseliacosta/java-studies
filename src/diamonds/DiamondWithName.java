package diamonds;

import java.util.Scanner;

public class DiamondWithName {
    public static void main(String[] args) {
        System.out.println("Enter the height of your triangle: ");
        Scanner scanner = new Scanner(System.in);
        int triangleHeight = scanner.nextInt();

        if(triangleHeight > 0) {
            for(int lines = 0; lines < triangleHeight; lines++) {
                for(int whiteSpace = 1; whiteSpace <= triangleHeight - lines; whiteSpace++){
                    System.out.print(" ");
                }

                for(int asterisks = 1; asterisks <= ((lines*2)-1); asterisks++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            System.out.println("RIHANNA");
            for(int lines = triangleHeight-1; lines > 0; lines --){
                for(int whiteSpace = 1; whiteSpace <= triangleHeight - lines; whiteSpace++){
                    System.out.print(" ");
                }

                for(int asterisks = 1; asterisks <= ((lines*2)-1); asterisks++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
