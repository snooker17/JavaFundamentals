import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _7_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] firstLine=scanner.nextLine().split(" ");
        String[] secondLine=scanner.nextLine().split(" ");
        ArrayList<Character> union=new ArrayList<>();
        ArrayList<Character> secondList=new ArrayList<>();

        for (int i = 0; i < firstLine.length; i++) {
            union.add(firstLine[i].charAt(0));
        }
        for (int i = 0; i < secondLine.length; i++) {
            secondList.add(secondLine[i].charAt(0));
        }



        for (Character ch : secondList) {
            if (!(union.contains(ch))) {
                union.add(ch);
            }
        }
        for (Character character : union) {
            System.out.print(character+" ");
        }
    }
}
