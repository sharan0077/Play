public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        boolean stopgame = false;
        game.initializeGame();
        game.startGame();
        while(stopgame == false) {
            stopgame = game.play();
        }
    }
}
