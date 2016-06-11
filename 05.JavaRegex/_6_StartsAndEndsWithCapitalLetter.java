import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _6_StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Pattern pattern=Pattern.compile("\\b[A-Z][^a-z0-9]*[A-za-z]+[A-Z]\\b");
        Matcher matcher=pattern.matcher(input);
        while (matcher.find()){
            System.out.printf(matcher.group()+" ");
        }

    }
}
