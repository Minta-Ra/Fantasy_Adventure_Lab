package players;
import heals.IHeal;


public class Cleric extends Player{

    private IHeal healer;

    public Cleric(String name, int healthPoints, IHeal healer) {
        super(name, healthPoints);
        this.healer = healer;
    }

    public void healOtherPlayer(Player player) {
        this.healer.healOtherPlayer(player);
    }

    public void changeHealMethod(IHeal newHealer) {
        this.healer = newHealer;
    }

    public IHeal getHealer() {
        return healer;
    }
}
