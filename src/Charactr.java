public class Charactr {

    int life;
    String name;

    public Charactr(String name) {
        this.name = name;
        this.life = 100;
    }


    public String getCharactrName() {
        return this.name;
    }

    public int getCharacteLifeStatus() {
        return this.life;
    }


    public void explore() {
        life++;
    }

    public void fight() {
        life--;
    }
}
