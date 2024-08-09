import model.TicToeGame;

public class Main {
    public static void main(String[] args) {

        TicToeGame game = new TicToeGame();
        game.initializeGame();
        System.out.println("Game winner is" + game.startGame());
    }
}