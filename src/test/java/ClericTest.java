import heals.IHeal;
import heals.Potion;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;
import weapons.IWeapon;
import weapons.Sword;
import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Knight knight;
    IHeal herbs;
    IHeal potion;
    IWeapon sword;

    @Before
    public void before() {
        potion = new Potion();
        sword = new Sword();
        knight = new Knight("Giffard", 10, sword);
        cleric = new Cleric("Donte", 10, herbs);
    }

    @Test
    public void hasName() {
        assertEquals("Donte", cleric.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(10, cleric.getHealthPoints());
    }

    @Test
    public void hasHealMethod() {
        assertEquals(herbs, cleric.getHealer());
    }

    @Test
    public void canHealOtherPlayer() {
        cleric.healOtherPlayer(knight);
        assertEquals(12, knight.getHealthPoints());
    }

    @Test
    public void canSwapHealer() {
        cleric.changeHealMethod(potion);
        cleric.healOtherPlayer(knight);
        assertEquals(potion, cleric.getHealer());
        assertEquals(15, knight.getHealthPoints());
    }

}
