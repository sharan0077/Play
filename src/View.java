import java.util.ArrayList;
import java.util.Scanner;

public class View {

    Scanner scanner = null;

    public boolean setScanner(Scanner scanner) {
        this.scanner = scanner;
        if(scanner != null)
            return true;
        return false;
    }

    public String getPlayerName() {
        String playerName;
        System.out.println("Enter the player name");
        playerName = scanner.nextLine();
        return playerName;
    }


    public void displayCharactrs(ArrayList<Charactr> charactrs) {
        System.out.println("Characters available in the game");
        for (Charactr charactr : charactrs) {
            System.out.println(charactr.name);
        }
    }

    public String getCharacter() {
        String charactrChosenByPlayer;
        System.out.println("Choose the character by entering the name of the Character");
        charactrChosenByPlayer = scanner.nextLine();
        return charactrChosenByPlayer;
    }

    public void displayInstructionToPlayer() {
        System.out.println("Choose the foolowing option");
        System.out.println("S - save game ");
        System.out.println("R - resume game ");
        System.out.println("F - Character Starts To Fight");
        System.out.println("E - Character Starts Exploring");
        System.out.println("Q - Quit the game");
    }

    public char getPlayersChoise() {
        char playerChoise = scanner.next().charAt(0);
        return playerChoise;
    }

    public void displayGameStatus(Player player) {
        System.out.println("player name : " + player.name);
        System.out.println("character choosen : " + player.charactr.name);
        System.out.println("Lifespan of character : " + player.charactr.getCharacteLifeStatus());
    }

    public void endGameMessage () {
        System.out.println("Game over ...Hope you enjoyed playing");
    }

}
