import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;
    Orc orc;

    @Before
    public void before(){
        axe = new Axe();
        orc = new Orc(20);
    }

    @Test
    public void canDoDamage(){
        axe.attack(orc);
        assertEquals(15, orc.getHealthPoints());
    }

}
