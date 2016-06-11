import java.util.*;

public class _1_TinySporeBat {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        int health=5800;
        int glowcaps=0;
        int totalGlowcaps=0;
        int prizeOfBat=30;

        String input=scanner.nextLine();
        while (!input.equals("Sporeggar")){
             glowcaps = input.charAt(input.length() - 1) - '0';
            char[] enemies = input.substring(0, input.length() - 1).toCharArray();
            for (char enemy : enemies) {
                if (enemy!='L'){
                    health-=enemy;
                    if (health<=0){
                        System.out.println("Died. Glowcaps: "+totalGlowcaps);
                        return;
                    }
                }else {
                    health+=200;
                }

            }
            totalGlowcaps+=glowcaps;
         input=scanner.nextLine();
        }

        if (totalGlowcaps>=30){
            System.out.println("Health left: "+health);
            System.out.println("Bought the sporebat. Glowcaps left: "+(totalGlowcaps-prizeOfBat));
        }else {
            System.out.println("Health left: "+health);
            System.out.printf("Safe in Sporeggar, but another %d Glowcaps needed.",prizeOfBat-totalGlowcaps);
        }
    }

}
