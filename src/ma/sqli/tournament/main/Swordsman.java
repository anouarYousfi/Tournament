package ma.sqli.tournament.main;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import java.util.logging.Logger;

public class Swordsman extends Fighter {

    public Swordsman() {
        this.axeHits =0;
        this.roundCount =0;
        this.healthPoints = 100;
        this.damage = 5;
        this.equipements=new ArrayList<>();
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
    public Swordsman equip(String equipement) {
        equipements.add(equipement);
        return this;
    }
}
