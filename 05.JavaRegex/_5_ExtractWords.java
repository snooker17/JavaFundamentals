import java.util.Scanner;

public class _5_ExtractWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().replaceAll("[\\W\\s0-9]+","|").split("[\\|]+");
        for (String s : input) {
            System.out.printf(s+" ");
        }


    }
}
