import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class playerTest {

    Factory factory = new Factory();

    @Test
    public void getPlayerName() throws Exception{
        Player player = factory.createPlayer("sharan");
        assertEquals("sharan",player.getName());
    }

    @Test
    public void chooseCharcter() throws Exception{
        Player player = factory.createPlayer("sharan");
        player.assignCharactr(new Charactr("harry"));
        assertEquals("harry",player.getCharactr().name);
    }

}