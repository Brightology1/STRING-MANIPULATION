import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInString {
    public static void main(String[] args) {
        // String contains all unique characters using map
        String x = "Brightology";
        x = x.replace(" ", "");
        char y[] = x.toCharArray();
        int count = 0;
        int i = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        //Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        //Map<Character, Integer> map = new TreeMap<Character, Integer>();
        while (i != y.length) {
            if (map.containsKey(y[i])) {
                map.put(y[i], map.get(y[i]) + 1);
            } else {
                map.put(y[i], 1);
            }
            i++;
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println("Does not contain unique characters");
                System.exit(0);
            }
        }
        System.out.println("Contains unique characters");
    }
}
