import java.util.Scanner;

public class _3_CountSpecifiedWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().toLowerCase().split("[\\W\\s]");
        String wordToSearch=scanner.nextLine().toLowerCase();
        int counter=0;

        for (int i = 0; i < input.length; i++) {
         if (wordToSearch.equals(input[i])){
             counter++;
         }
        }
        System.out.println(counter);


    }
}
