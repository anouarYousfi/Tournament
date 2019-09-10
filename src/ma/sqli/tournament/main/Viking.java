package ma.sqli.tournament.main;

public class Viking extends Fighter {

    public Viking() {
        this.healthPoints = 120;
        this.damage = 6;
    }

    @Override
    public void engage(Fighter fighter) {
        while(!isSomeoneDead(fighter)) {
            injure(fighter);
            fighter.engage(this);

        }
    }


}

