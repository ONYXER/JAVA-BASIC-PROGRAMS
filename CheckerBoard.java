package pattern;

import java.util.Scanner;

public class CheckerBoard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        Byte size = sc.nextByte();
        sc.close();
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");

            }
            for (int j = 1; j <= size; j++)
                System.out.print("# ");
            System.out.println();
        }
        
    }
}
