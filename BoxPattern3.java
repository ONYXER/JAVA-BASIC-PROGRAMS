package pattern;

public class BoxPattern3 {
    public static void main(String[] args) {
        Byte n = 7;
        System.out.printf("\033[032m");
        for (Byte i = 1; i <= n; i++) {
            for (Byte j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || j == i || j == (n + 1 - i))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
