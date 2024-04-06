package pattern;
public class TriangularPattern3 {
    public static void main(String[] args) {
        for (byte i = 8; i >= 1; i--) {
            for (byte j = 8; j >= i; j--)
                System.out.print("  ");
            for (byte j = 1; j <= i; j++)
                System.out.print("# ");
            System.out.println();
        }
    }
}