package pattern;

public class TimeTable {
    public static void main(String[] args) {

        System.out.printf("%2c |", '*');
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("----");
        for (int i = 1; i <= 10; i++)
            System.out.print("----");
        System.out.println();
        // printing table
        for (byte i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i);
            for (byte j = 1; j <= 10; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }

    }
}
