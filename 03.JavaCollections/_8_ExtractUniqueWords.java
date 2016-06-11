import java.util.HashSet;
import java.util.Scanner;

public class _8_ExtractUniqueWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split("([().,!?:;'\"-]|\\s)+");
        HashSet<String> set=new HashSet<>();
        for (String str : input) {
        set.add(str.toLowerCase());
        }
        for (String s : set) {
            System.out.print(s+" ");
        }
    }
}
