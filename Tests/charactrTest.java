import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class charactrTest {

    Factory factory = new Factory();

    @Test
    public void aTestCaseToCreateCharacter() throws Exception {
        Charactr charactr = factory.createCharactr("Harry");
        assertEquals("Harry", charactr.getCharactrName());
        assertEquals(100,charactr.getCharacteLifeStatus());
    }

    @Test
    public void aTestCaseForCharacterToExplore() throws Exception {
        Charactr charactr = factory.createCharactr("Harry");
        assertEquals(100,charactr.getCharacteLifeStatus());
        charactr.explore();
        assertEquals(101,charactr.getCharacteLifeStatus());
    }

    @Test
    public void aTestCaseForCharacterToFight() throws Exception {
        Charactr charactr = factory.createCharactr("Harry");
        assertEquals(100,charactr.getCharacteLifeStatus());
        charactr.fight();
        assertEquals(99,charactr.getCharacteLifeStatus());
    }
}