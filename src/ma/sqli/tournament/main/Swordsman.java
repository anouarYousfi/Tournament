package ma.sqli.tournament.main;

import java.util.logging.Logger;

public class Swordsman extends Fighter {

    public Swordsman() {
        this.healthPoints = 100;
        this.damage = 5;
    }

    @Override
    public void engage(Fighter fighter) {
        while (!isSomeoneDead(fighter)) {

            injure(fighter);
            fighter.engage(this);

        }

    }
}
