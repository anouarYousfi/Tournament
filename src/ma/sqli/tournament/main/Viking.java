package ma.sqli.tournament.main;

import java.util.ArrayList;

public class Viking extends Fighter {

    public Viking() {
        this.axeHits =0;
        this.roundCount =0;
        this.healthPoints = 120;
        this.damage = 6;
        this.equipements=new ArrayList<>();
        this.equip("axe");

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
    public Viking equip(String equipement) {
        equipements.add(equipement);
        return this;
    }


}

