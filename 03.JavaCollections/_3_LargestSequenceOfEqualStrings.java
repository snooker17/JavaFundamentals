import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] line =scanner.nextLine().split(" ");

        Map<String,Integer> map=new TreeMap<>();
        for (String word: line) {
            Integer count=map.get(word);
            if (count==null){
                count=0;
            }
            map.put(word,count+1);
        }
        Map.Entry<String,Integer> maxEntry=null;
        for (Map.Entry<String,Integer> entry :map.entrySet() ) {
            if (maxEntry == null
                    || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        for (int i = 0; i <maxEntry.getValue() ; i++) {
            System.out.print(maxEntry.getKey()+" ");
        }
    }
}
