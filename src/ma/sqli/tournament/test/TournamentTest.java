package ma.sqli.tournament.test;

import ma.sqli.tournament.main.Swordsman;
import ma.sqli.tournament.main.Viking;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 *
 * This is a duel simulation
 *
 * Blow exchange are sequential, A engage B means that A will give the first blow, then B will respond
 *
 */
public class TournamentTest {


    /**
     * A Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg
     * A Viking has 120 hit points and use a 1 hand axe that does 6 dmg
     */
    @Test
    public void SwordsmanVsViking() {

        Swordsman swordsman = new Swordsman();

        Viking viking = new Viking();

        swordsman.engage(viking);

        assertEquals(swordsman.hitPoints(),0);
        assertThat(viking.hitPoints()).isEqualTo(35);

    }
}