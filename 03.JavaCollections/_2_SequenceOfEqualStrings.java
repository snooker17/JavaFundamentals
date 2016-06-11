import java.util.HashMap;
import java.util.Scanner;

public class _2_SequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] line=scanner.nextLine().split(" ");

        System.out.print(line[0]);
        for (int i = 1; i < line.length; i++) {
            if (line[i].equals(line[i-1])){
                System.out.print(" "+line[i]);
            }else{
                System.out.println();
                System.out.print(line[i]);
            }
        }


    }
}
