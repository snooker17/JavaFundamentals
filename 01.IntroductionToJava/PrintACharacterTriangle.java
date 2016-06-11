import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] Args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i =0;i<n;i++) {
            for (int f=0;f<=i;f++) {
                System.out.print((char)('a'+f));
            }
            System.out.println();
        }
        for (int i=n-1;i>0;i--) {
            for (int f=0;f<=i-1;f++){
                System.out.print((char)('a'+f));
            }
            System.out.println();
        }
    }
}
