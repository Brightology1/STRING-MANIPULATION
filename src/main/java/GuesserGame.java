import java.util.Scanner;

public class GuesserGame {
    int gnum;
    
    public int guessNum(){
        System.out.println("Guesser! Kindly guess a number between 1 to 100");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
}
