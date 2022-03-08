package players;
import enemies.Enemy;
import magic.ISpell;
import protects.IDefend;

public abstract class Mage extends Player{

    private ISpell spell;
    private IDefend defend;

    public Mage(String name, int healthPoints, ISpell spell, IDefend defend) {
        super(name, healthPoints);
        this.spell = spell;
        this.defend = defend;
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }

    public void defendMageHitEnemy(Enemy enemy){
        this.defend.defendMageHitEnemy(enemy);
    }

    public ISpell getSpell() {
        return spell;
    }

    public IDefend getDefend() {
        return defend;
    }

    public void setDefend(IDefend getDefended){
        if(this.defend == null){
            this.defend = getDefended;
        }
    }

}
