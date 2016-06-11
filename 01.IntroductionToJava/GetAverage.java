import java.util.Scanner;
public class GetAverage {
    public static void main(String[] Args){
        Scanner scanner=new Scanner(System.in);
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        float c=scanner.nextFloat();
        System.out.printf("%.2f",getAverage(a,b,c));

    }
    public static double getAverage(float a,float b,float c) {
        double result=0;
        result=(a+b+c)/3;
        return result;

    }
}
