import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_CountSubstringOccurences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine().toLowerCase();
        String wordToSearch=scanner.nextLine().toLowerCase();
        Pattern pattern=Pattern.compile(wordToSearch);
        Matcher match=pattern.matcher(input);
        int counter=0;
        int position=0;
        while(match.find(position)){
            counter++;
            position=match.start()+1;

        }
        System.out.println(counter);
    }
}
