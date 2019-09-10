package ma.sqli.tournament.main;

public abstract class Fighter {
    protected int healthPoints;
    protected int damage;


    public abstract void engage(Fighter fighter);

    public void injure(Fighter fighter) {
        fighter.healthPoints = fighter.healthPoints - this.damage;
    }

    public int hitPoints() {
        if (healthPoints < 0) {
            return 0;
        } else {
            return healthPoints;
        }
    }

    public boolean isSomeoneDead(Fighter fighter) {
        return (this.healthPoints <= 0 || fighter.healthPoints <= 0);
    }

}
