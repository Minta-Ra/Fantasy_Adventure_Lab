import enemies.Enemy;
import enemies.Orc;
import magic.ISpell;
import magic.LighteningStrike;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;
import protects.Dragon;
import protects.IDefend;
import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Enemy enemy;
    ISpell spell;
    IDefend defend;
    IDefend defend1;

    @Before
    public void before(){
        defend = null;
        defend1 = new Dragon();
        spell = new LighteningStrike();
        enemy = new Orc(10);
        warlock = new Warlock("Merlin", 10, spell, defend);
    }

    @Test
    public void hasName(){
        assertEquals("Merlin", warlock.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, warlock.getHealthPoints());
    }

    @Test
    public void canCast(){
        warlock.cast(enemy);
        assertEquals(6, enemy.getHealthPoints());
    }

    @Test
    public void canGetDefended(){
        warlock.cast(enemy);
        warlock.setDefend(defend1);
        warlock.defendMageHitEnemy(enemy);
        assertEquals(defend1, warlock.getDefend());
        assertEquals(5, enemy.getHealthPoints());
    }

}
