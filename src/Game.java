import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Factory factory = new Factory();
    View view = null;
    ArrayList<Charactr> charactrs = new ArrayList<Charactr>();
    Player player;
    Scanner scanner;

    public boolean setView() {
        this.view = factory.createView();
        if (this.view != null)
            return true;
        return false;
    }

    public boolean setScannerInView() {
        this.scanner = factory.createScanner();
        return view.setScanner(scanner);
    }

    public void initializeGame() {
        boolean isviewSet = setView();
        boolean isScannerSetInView = setScannerInView();
    }

    public ArrayList<Charactr> getCharactrs() {
        this.charactrs.add(new Charactr("harry"));
        this.charactrs.add(new Charactr("john"));
        this.charactrs.add(new Charactr("ron"));
        return charactrs;
    }

    public void startGame() {
        String playerName = view.getPlayerName();
        player = factory.createPlayer(playerName);
        ArrayList<Charactr> charactrs = getCharactrs();
        view.displayCharactrs(charactrs);
        player.assignCharactr(factory.createCharactr(view.getCharacter()));
    }

    public boolean play() {
        boolean stopgame = false;
        char playerChoise;
        view.displayInstructionToPlayer();
        playerChoise = view.getPlayersChoise();
        if ( player.charactr.life <= 0){
            view.endGameMessage();
            stopgame = true;
            return stopgame;
        }
        switch (Character.toUpperCase(playerChoise)) {
            case 'F' : this.player.charactr.fight();break;
            case 'E' : this.player.charactr.explore();break;
            case 'S' : view.displayGameStatus(this.player);return stopgame;
            case 'R' : view.displayInstructionToPlayer();break;
            case 'Q' : stopgame = true;break;
        }
        return stopgame;
    }
}
