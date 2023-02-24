package sem4;

import sem4.Shields.BigShield;
import sem4.Weapons.Melee;


public class Footman extends BaseHero<Melee, BigShield> {

    public Footman(int health, String name, Melee weapon, BigShield shield) {
        super(health, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                "} " + super.toString();
    }
}