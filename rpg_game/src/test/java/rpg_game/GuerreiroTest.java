package rpg_game;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuerreiroTest extends PersonagemTest {

    Guerreiro guerreiro;

    @Before
    public void setUp()  {
        guerreiro = new Guerreiro("guerreiro");
    }

    @Test
    public void testLvlUp() {
        guerreiro.lvlUp();
        assertEquals(2, guerreiro.getLevel());
        assertEquals(13, guerreiro.getForca());
        assertEquals(6, guerreiro.getAgilidade());
        assertEquals(3, guerreiro.getInteligencia());
    }

    @Test
    public void testAtaque() {
        guerreiro.ataque();
        assertEquals(8, 8);
    }

    @Test
    public void testAtaque2() {
        guerreiro.ataque2();
        assertEquals(10, 10);
    }
}