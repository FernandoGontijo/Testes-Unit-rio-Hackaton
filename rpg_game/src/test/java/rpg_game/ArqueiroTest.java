package rpg_game;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class ArqueiroTest extends PersonagemTest {

    Arqueiro arqueiro;

    @Before
    public void setUp()  {
        arqueiro = new Arqueiro("arqueiro");
    }

    @Test
    public void testLvlUp() {
        arqueiro.lvlUp();
        assertEquals(2, arqueiro.getLevel());
        assertEquals(6, arqueiro.getForca());
        assertEquals(13, arqueiro.getAgilidade());
        assertEquals(6, arqueiro.getInteligencia());

    }

    @Test
    public void testAtaque() {
        arqueiro.ataque();
        assertEquals(8, 8);
    }

    @Test
    public void testAtaque2() {
        arqueiro.ataque2();
        assertEquals(10, 10);
    }
}