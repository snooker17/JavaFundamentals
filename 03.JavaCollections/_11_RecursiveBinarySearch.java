import java.util.Arrays;
import java.util.Scanner;

public class _11_RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int key=Integer.parseInt(scanner.nextLine());
        String[] input=scanner.nextLine().split(" ");
        int[] numbers=new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i]=Integer.parseInt(input[i]);

        }
        Arrays.sort(numbers);
        System.out.println(recursiveBinarySearch(numbers,numbers[0],numbers[numbers.length-1],key));

    }
    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);

            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid + 1, end, key);

            } else {
                return mid;
            }
        }
        return -(start + 1);
    }
}
