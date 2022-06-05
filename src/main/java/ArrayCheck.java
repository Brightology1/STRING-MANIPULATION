import java.util.Arrays;
import java.util.List;

public class ArrayCheck {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int data = numbers.stream().reduce(0, (s, e) -> s + e);
        System.out.println("Data is: "+ data);
    }
}
