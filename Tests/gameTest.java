import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gameTest {

    @Test
    public void setViewInsideGame() {
        Game game = new Game();
        assertEquals(game.setView(),true);
    }

    @Test
    public void setScannerInView () {
        Game game = new Game();
        game.setView();
        assertEquals(game.setScannerInView(),true);
    }

    @Test
    public void getCharacters () {
        Game game = new Game();
        assertEquals(game.getCharactrs().get(0).name,"harry");
        assertEquals(game.getCharactrs().get(1).name,"john");
        assertEquals(game.getCharactrs().get(2).name,"ron");
    }

}