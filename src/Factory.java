import java.util.Scanner;

public class Factory {

    public Player createPlayer(String name) {
        return new Player(name);
    }

    public Charactr createCharactr(String name) {
        return new Charactr(name);
    }

    public View createView() {
        return new View();
    }

    public Scanner createScanner() {
        return new Scanner(System.in);
    }
}
