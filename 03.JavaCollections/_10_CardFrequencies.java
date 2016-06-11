import java.util.*;

public class _10_CardFrequencies {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split("([♥♣♦♠]|\\s)+");
        int all=input.length;
        Map<String,Integer> map=new LinkedHashMap<>();
        for (String s : input) {
            Integer count=map.get(s);
            if (count==null){
                count=0;
            }
            map.put(s,count+1);
        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %.2f%%\n",entry.getKey(),(double)entry.getValue()/all*100);
        }
    }
}
