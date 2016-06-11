import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        long result=0;
        for (int i = 0; i <input.length() ; i++) {
            result+=(int)(input.charAt(i));
        }
        System.out.println(result);
    }
}
