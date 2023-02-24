package sem4;



import sem4.Shields.BigShield;
import sem4.Shields.SmallShield;
import sem4.Weapons.Melee;
import sem4.Weapons.Ranged;

public class Main {

    public static void main(String[] args) {

        Team<Footman> squadF = new Team<>();

        squadF.add(new Footman(55, "joe", new Melee("spear", 15), new BigShield("aegis", 20)));
        squadF.add(new Footman(55, "moe", new Melee("sword", 10), new BigShield("buckler", 60)));
        squadF.add(new Footman(55, "doe", new Melee("axe", 20), new BigShield("shield",40)));

        for (Footman item : squadF) {
            System.out.println(item);
        }

        System.out.println(squadF.getTeamHealth());
        System.out.println(squadF.getMaxRange());
        System.out.println(squadF.getSumDamage());
        System.out.println(squadF.getSumArmor());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Team<BaseHero> squadA = new Team<>();

        squadA.add(new Archer(15, "jonh", new Ranged("bow", 5, 50), new SmallShield("Defender", 20)));
        squadA.add(new Archer(15, "jonathan", new Ranged("crossbow", 15, 25), new SmallShield("Bulwark", 20)));
        squadA.add(new Footman(55, "carl", new Melee("sword", 10), new BigShield("Crimson Gladiator's Bulwark", 55)));
        squadA.add(new Footman(55, "earl", new Melee("axe", 20), new BigShield("Extinct Turtle Shell", 30)));

        for (BaseHero item : squadA) {
            System.out.println(item);
        }



        System.out.println(squadA.getTeamHealth());
        System.out.println(squadA.getMaxRange());
        System.out.println(squadA.getSumDamage());
        System.out.println(squadA.getSumArmor());

        Footman footman1 = new Footman(77 , "marks" , new Melee("Taeshalach"  , 30), new BigShield("Bulwark of Azzinoth", 50));
        Footman footman2 = new Footman(66 , "adamS" , new Melee("Frostmourne"  , 45), new BigShield("Icecrown Glacial Wall", 65));
        while (footman1.getHealth()>0 && footman2.getHealth()> 0){
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("~~~~~~~~");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("____________");


        }

        if (footman1.getHealth()>0){

            System.out.println(footman1 + " is Winner");
        }
        else {
            System.out.println(footman2 + " is Winner");
        }
    }

}
