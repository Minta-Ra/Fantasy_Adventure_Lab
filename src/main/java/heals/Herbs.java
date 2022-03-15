package heals;
import players.Player;

public class Herbs implements IHeal{

    private int heal;

    public Herbs() {
        this.heal = 2;
    }

    public void healOtherPlayer(Player player) {
        player.increaseHealth(heal);
    }

}
