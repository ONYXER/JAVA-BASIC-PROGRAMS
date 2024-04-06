package pattern;

public class BlankStar {
    public static void main(String[] args) {
        final Byte n = 7;
        Byte i;
        Byte j;
        for (i = 1; i <= (n + n - 1); i++) {
            if (i <= 7) {
                for (j = 7; j >= i; j--)
                    System.out.print("# ");
                for (j = 1; j < i; j++)
                    System.out.print("    ");

                for (j = 7; j >= i; j--)
                    System.out.print("# ");

            } else {
              
                for (j = 7; j <= i; j++)
                    System.out.print("# ");
            }
            for (j = 1; j < n + n - i; j++)
                System.out.print("    ");
            for (j = 7; j <= i; j++)
                System.out.print("# ");

            System.out.println();
        }

    }
}
