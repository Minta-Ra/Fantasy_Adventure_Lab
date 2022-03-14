package protects;
import enemies.Enemy;

public class Ogre implements IDefend{

    private int defend;

    public Ogre() {
        this.defend = 2;
    }

    public void defendMageHitEnemy(Enemy enemy) {
        enemy.takeDamage(defend);
    }
}
