package ma.sqli.tournament.main;

import java.util.ArrayList;

public class Swordsman extends Fighter {

    public Swordsman() {
        this.axeHits =0;
        this.roundCount =0;
        this.healthPoints = 100;
        this.damage = 5;
        this.equipements=new ArrayList<>();
    }

    @Override
    public void engage(Fighter fighter) {
        while (!isSomeoneDead(fighter)) {
            injure(fighter);
            fighter.engage(this);

        }

    }
    public Swordsman equip(String equipement) {
        equipements.add(equipement);
        return this;
    }
}
