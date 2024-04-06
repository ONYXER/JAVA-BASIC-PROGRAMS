package pattern;

public class NumberPattern3 {
    public static void main(String[] args) {
        final Byte n = 8;
        Byte i, j;
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--)
                System.out.print("  ");
            for (j = i; j >= 1; j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
