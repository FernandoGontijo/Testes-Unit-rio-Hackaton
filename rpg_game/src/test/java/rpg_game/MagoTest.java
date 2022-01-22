package rpg_game;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MagoTest extends PersonagemTest {

    Mago mago;

    @Before
    public void setUp()  {
        mago = new Mago("mago");
    }

    @Test
    public void testLvlUp() {
        mago.lvlUp();
        assertEquals(2, mago.getLevel());
        assertEquals(3, mago.getForca());
        assertEquals(6, mago.getAgilidade());
        assertEquals(13, mago.getInteligencia());
    }

    @Test
    public void testAtaque() {
        mago.ataque();
        assertEquals(8, 8);
    }

    @Test
    public void testAtaque2() {
        mago.ataque2();
        assertEquals(10, 10);
    }
}