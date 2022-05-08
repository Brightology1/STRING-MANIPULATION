import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "lISten  is";
        String s2 = "silent is";
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char y[] = s1.toCharArray();
        char x[] = s2.toCharArray();
        Arrays.sort(y);
        Arrays.sort(x);
        if(Arrays.equals(y, x)) {
            System.out.println("It is Anagram");
        }
        else {
            System.out.println("It is not Anagram");
        }
    }
}
