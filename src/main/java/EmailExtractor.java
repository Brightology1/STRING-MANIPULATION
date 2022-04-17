import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor{
    public static void main(String[]args)
    {
        String s = "i:0#.+|membership|jack.muller@ekedp.com";
        Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
