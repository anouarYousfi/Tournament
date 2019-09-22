package ma.sqli.tournament.main;

import java.util.List;

public abstract class Fighter {
    protected int healthPoints;
    protected int damage;
    protected int axeHits;
    protected int roundCount;
    protected List<String> equipements;



    public abstract void engage(Fighter fighter);

    public void injure(Fighter fighter) {
        if(fighter.axeHits>3)
        {fighter.destroyEquipement("buckler");}
        if (!fighter.equipements.contains("buckler")) {
            fighter.healthPoints = fighter.healthPoints - this.damage;
            if (equipements.contains("axe")) {
                fighter.axeHits++;
            }

        } else {
            if (roundCount % 2 != 0) {
                fighter.healthPoints = fighter.healthPoints - this.damage;
                if (equipements.contains("axe")) {
                    fighter.axeHits++;
                }
            }

        }
        roundCount++;

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
public  Fighter aedqd(){

}

    public void destroyEquipement(String equipement) {
        equipements.remove(equipement);
    }


}
