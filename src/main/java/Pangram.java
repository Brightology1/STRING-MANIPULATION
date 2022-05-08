import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        System.out.println(isPangram(input));
    }

    private static boolean isPangram(String input) {
        Set<Character> alphabet = new HashSet<>();
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet.add(c);
            }
        }
        return alphabet.size() == 26;
    }

//    String x = "The quick brown fox jumps over the lazy dog";
//    x = x.replace(" ", "");
//    // x = x.toLowerCase();
//    char y[] = x.toCharArray();
//    int size = y.length;
//    int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//    int i = 0;
//        while (i != size) {
//        int index = y[i] - 65;
//        a[index] = 1;
//        ++i;
//    }
//    i = 0;
//        while (i != 26) {
//        if (a[i] == 1) {
//            ++i;
//        }
//        else {
//            System.out.println("Not pangram");
//            System.exit(0);
//        }
//    }
//        System.out.println("Pangram");
}
