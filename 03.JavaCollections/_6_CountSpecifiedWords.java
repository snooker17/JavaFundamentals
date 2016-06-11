import java.util.Scanner;

public class _6_CountSpecifiedWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().toLowerCase().split("([().,!?:;'\"-]|\\s)+");
        String wordToSearchFor=scanner.next().toLowerCase();
        int count=0;
        for (int i = 0; i < input.length; i++) {
            if (wordToSearchFor.equals(input[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
