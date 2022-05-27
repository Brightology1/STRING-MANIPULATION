import java.util.Scanner;

public class GuesserGame {

    int gnum;
    public int guessNum(){
        System.out.println("Guesser! Kindly guess a number between 1 to 100");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
public void checkGuess(int gnum){
        if(gnum == 50){
            System.out.println("You guessed it right!");
        }
        else if(gnum < 50){
            System.out.println("Your guess is too low");
        }
        else{
            System.out.println("Your guess is too high");
        }
    }


}
