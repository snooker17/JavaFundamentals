import java.util.*;

public class _9_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().toLowerCase().split("([().,!?:;'\"-]|\\s)+");

        Map<String,Integer> map = new TreeMap<>();

        for (String str : input) {
            Integer count = map.get(str);
            if (count == null) {
                count = 0;
            }
            map.put(str,count + 1);
        }
        List<String> set=new ArrayList<>();
        Map.Entry<String,Integer> maxEntry=null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry==null||
                    entry.getValue().compareTo(maxEntry.getValue())>0){
              maxEntry=entry;
            }
        }
        for (Map.Entry<String, Integer> integerEntry : map.entrySet()) {
            if (integerEntry.getValue()==maxEntry.getValue()){
                set.add(integerEntry.getKey());
            }
        }


        for (String s : set) {
            System.out.println(s+" -> "+maxEntry.getValue()+" times");
        }

    }
}