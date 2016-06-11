import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _4_CountAllWords {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        List<String>list=Arrays.asList(console.nextLine().split("[\\W\\s]+"));
        System.out.println(list.size());
    }
}
