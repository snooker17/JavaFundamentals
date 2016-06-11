import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _1_SortArrayOfNumbers2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String[] splittedLine=scanner.nextLine().split(" ");

        int[] numbers=new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i]=Integer.parseInt(splittedLine[i]);
        }
        Arrays.sort(numbers);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
