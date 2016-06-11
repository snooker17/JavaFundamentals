import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2_SortArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        String order=scanner.nextLine();
        Integer[] numbers=new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i]=Integer.parseInt(input[i]);
        }
        if (order.equals("Ascending")) {
            Arrays.stream(numbers).sorted().forEach((n) -> System.out.format(n + " "));
        }
        else if(order.equals("Descending")){
            Arrays.asList(numbers).stream().sorted(Collections.reverseOrder()).forEach((n) -> System.out.format(n + " "));
        }
        else{
            System.out.println("Wrong option!!!");
        }
    }
}
