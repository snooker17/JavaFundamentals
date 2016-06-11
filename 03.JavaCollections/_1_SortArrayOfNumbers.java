import java.util.Scanner;

public class _1_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cycles=Integer.parseInt(scanner.nextLine());

        String[] splittedLine=scanner.nextLine().split(" ");
        int[] numbers=new int[cycles];

         //Parsing String To Int
        for (int i = 0; i < cycles; i++) {
          numbers[i]=Integer.parseInt(splittedLine[i]);
        }
        //Selection Sort
        if (numbers.length<=1) {
            System.out.println(numbers[0]);
        }else {
            for (int left = 0; left < cycles-1; left++) {
                int minIndex = left;
                for (int i = left + 1; i < cycles; i++) {
                    if (numbers[i] < numbers[minIndex]) {
                        minIndex = i;
                    }
                    if (minIndex != left) {
                        int temp = numbers[minIndex];
                        numbers[minIndex] = numbers[left];
                        numbers[left] = temp;
                    }
                }
            }
            //Printing
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]+" ");
            }
        }

    }
}
