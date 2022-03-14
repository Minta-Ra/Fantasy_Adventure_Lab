import enemies.Enemy;
import enemies.Orc;
import magic.Fireball;
import magic.ISpell;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import protects.IDefend;
import protects.Ogre;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Enemy enemy;
    ISpell spell;
    IDefend defend;
    IDefend defend1;

    @Before
    public void before(){
        defend = null;
        defend1 = new Ogre();
        spell = new Fireball();
        enemy = new Orc(10);
        wizard = new Wizard("Harry", 10, spell, defend);
    }

    @Test
    public void hasName(){
        assertEquals("Harry", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, wizard.getHealthPoints());
    }

    @Test
    public void canCast(){
        wizard.cast(enemy);
        assertEquals(7, enemy.getHealthPoints());
    }

    @Test
    public void canGetDefended(){
        wizard.cast(enemy);
        wizard.cast(enemy);
        wizard.setDefend(defend1);
        wizard.defendMageHitEnemy(enemy);
        assertEquals(defend1, wizard.getDefend());
        assertEquals(2, enemy.getHealthPoints());
    }

}
