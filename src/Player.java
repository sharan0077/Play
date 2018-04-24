import java.util.ArrayList;

public class Player {


    String name;
    Charactr charactr;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void assignCharactr(Charactr charactr){
        this.charactr = charactr;
    }


    public Charactr getCharactr() {
        return this.charactr;
    }
}
