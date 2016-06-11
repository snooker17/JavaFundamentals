import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class _1_FilterArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        List<String> isEmpty=Arrays.stream(input).filter(n->n.length()>3).collect(Collectors.toList());
        if (isEmpty.size()<=0) {
            System.out.println("(empty)");
        }
        else{
            isEmpty.stream().forEach((n)->System.out.format(n+" "));
        }


    }
}
