import java.util.Scanner;

public class _12_CalculateFactoriel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        System.out.println(Factoriel(num));


    }
    public static long Factoriel(int num){
        long fact=0;
        if(num==1){
            return 1;
        }else{
            return fact=Factoriel(num-1)*num;
        }
    }
}
