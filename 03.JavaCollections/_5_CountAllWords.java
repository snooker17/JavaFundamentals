import java.util.Scanner;

public class _5_CountAllWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split("([().,!?:;'\"-]|\\s)+");
        System.out.println(input.length);
    }
}
