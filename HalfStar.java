package pattern;

public class HalfStar {
 public static void main(String[] args) {
    final Byte n=7;
    for(Byte i=1;i<=n;i++){
        for(Byte j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(Byte j=1;j<=i;j++){
            System.out.printf("\033[03%dm",i);
            System.out.print("# ");
        }
        System.out.println();
    }
 }   
}
