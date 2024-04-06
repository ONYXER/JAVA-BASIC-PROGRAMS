package pattern;

public class NumberPattern {
  public static void main(String[] args) {
    final Byte n=8;
    Byte i,j;

    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
  }
}
