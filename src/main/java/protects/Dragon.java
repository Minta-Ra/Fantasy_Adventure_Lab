package protects;
import enemies.Enemy;

public class Dragon implements IDefend{

    private int defend;

    public Dragon() {
        this.defend = 1;
    }

    public void defendMageHitEnemy(Enemy enemy) {
        enemy.takeDamage(defend);
    }

}

