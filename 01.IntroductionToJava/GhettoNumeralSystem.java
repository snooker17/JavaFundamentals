import java.util.Scanner;
public class GhettoNumeralSystem {
    public static void main(String[] Args){
        Scanner scanner=new Scanner(System.in);
        String value=scanner.nextLine();
        char[] valueArr=value.toCharArray();
        int [] realValue=new int[value.length()];
        String name=null;
        for (int i=0;i<value.length();i++) {
         realValue[i]= Character.getNumericValue(valueArr[i]);
            switch (realValue[i]){
                case 0:name="Gee";break;
                case 1:name="Bro";break;
                case 2:name="Zuz";break;
                case 3:name="Ma";break;
                case 4:name="Duh";break;
                case 5:name="Yo";break;
                case 6:name="Dis";break;
                case 7:name="Hood";break;
                case 8:name="Jam";break;
                case 9:name="Mack";break;

            }
            System.out.print(name);
        }


    }
}
