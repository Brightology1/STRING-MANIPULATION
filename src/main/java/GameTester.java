import java.util.logging.Logger;

public class GameTester {
  // static Logger logger = Logger.getLogger(GameTester.class.getName());
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(GameTester.class.getName());
        GuesserGame game = new GuesserGame();
        game.guessNum();
        game.checkGuess(50);
        logger.info("Game over");
        //logger.log(LEVEL.INFO, "The Game is over");
    }
}
