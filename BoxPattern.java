package pattern;

public class BoxPattern {
    public static void main(String[] args) {
        for (Byte i = 1; i <= 7; i++) {
            for (Byte j = 1; j <= 7; j++) {
                if (i == 1 || i == 7 || j == i || j==(8-i))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
