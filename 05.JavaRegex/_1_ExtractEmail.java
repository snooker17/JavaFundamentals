import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

public class _1_ExtractEmail {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Pattern pattern=Pattern.compile("(?!\\_|\\.|\\-)[A-Z0-9a-z\\.\\-\\_]+[^\\.|\\_|\\-]@[a-zA-Z\\.\\-]+\\b");
        Matcher matcher=pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
