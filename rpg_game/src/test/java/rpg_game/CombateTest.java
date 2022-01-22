package rpg_game;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CombateTest extends TestCase {

    Personagem personagem1;
    Personagem personagem2;
    Personagem personagem3;
    Personagem personagem4;

    Combate combate;

    @Before
    public void setUp() {

        combate = new Combate();

        personagem1 = new Personagem();
        personagem2 = new Personagem();
        personagem3 = new Personagem();
        personagem4 = new Personagem();

        personagem1.setNome("Personagem1");
        personagem1.setInteligencia(11);
        personagem1.ataque();


        personagem2.setNome("Personagem2");
        personagem2.setInteligencia(10);
        personagem2.setHp(100);


        personagem3.setNome("Personagem3");
        personagem3.setInteligencia(11);


        personagem4.setNome("Personagem4");
        personagem4.setInteligencia(12);


    }

    @Test
    public void testLutaCorporal() {

        combate.lutaCorporal(personagem1,personagem2);
        assertEquals(100, personagem2.getHp());
    }

    @Test
    public void testEmbateXadrez() {
        assertEquals("Personagem1 ganhou",combate.embateXadrez(personagem1,personagem2));
        assertEquals("Disputa no cara ou coroa",combate.embateXadrez(personagem1,personagem3));
        assertEquals("Personagem4 ganhou",combate.embateXadrez(personagem1,personagem4));
    }
}