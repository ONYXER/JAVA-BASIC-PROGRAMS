package pattern;

public class NumberPattern2 {
    public static void main(String[] args) {
        final Byte n = 8;
        Byte i, j;
        for (i = n; i >= 1; i--) {
            for (j = n; j > i; j--)
                System.out.print("  ");
            for (j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
