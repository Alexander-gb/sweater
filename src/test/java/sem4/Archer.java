package sem4;

import sem4.Shields.SmallShield;
import sem4.Weapons.Ranged;



public class Archer extends BaseHero<Ranged, SmallShield>{
    public Archer(int health, String name, Ranged ranged, SmallShield shield) {
        super(health, name, ranged, shield);

    }

    public  int range(){
        return  weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "weapon=" + weapon +
                "} " + super.toString();
    }
}