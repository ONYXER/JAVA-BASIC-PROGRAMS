package pattern;

public class SecondHalfStar {
    public static void main(String[] args) {
        final Byte n = 7;
        for (Byte i = n; i >= 1; i--) {
            for (Byte j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (Byte j = 1; j <= i; j++)
                System.out.print("# ");
            System.out.println();
        }
    }
}
