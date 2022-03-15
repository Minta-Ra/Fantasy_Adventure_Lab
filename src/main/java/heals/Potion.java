package heals;
import players.Player;

public class Potion implements IHeal{

    private int heal;

    public Potion() {
        this.heal = 5;
    }

    public void healOtherPlayer(Player player) {
        player.increaseHealth(heal);
    }

}
