package rpg_game;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;



public class PersonagemTest {

    Personagem personagem;
    Bota bota;
    BotaBronze botaBronze;
    BotaPrata botaPrata;

    int agilidade = 0;
    int forca = 0;
    int inteligencia = 0;
    String funcao = "Funcao";
    String nome = "Nome";

    int hp = 100;
    int mana = 50;

    int level = 1;

    @Before
    public void setUp() throws Exception {

        bota = new Bota();

        botaBronze = new BotaBronze();

        botaPrata = new BotaPrata();

        personagem = Mockito.mock(Personagem.class);

        bota.setForca(2);
        bota.setAgilidade(1);
        bota.setInteligencia(1);
        bota.setNomeBota("Bota prata");

        personagem.setHp(100);
        personagem.getMana();
        personagem.setForca(0);


    }

    @Test
    public void testEquiparBota() {
        personagem.EquiparBota(botaBronze);
        personagem.EquiparBota(botaPrata);
    }

    @Test
    public void testGetInteligencia() {
        personagem.getInteligencia();
    }

    @Test
    public void testExibirDadosInicialJogador() {
        personagem.exibirDadosInicialJogador();
    }

    @Test
    public void testExibirNovosDadosJogador() {
        personagem.exibirNovosDadosJogador();
    }
}