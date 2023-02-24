package sem4;



import java.util.Random;


public abstract class BaseHero <W extends Weapon, S extends Shield>  {


    private int health;

    private String name;

    protected W weapon;

    private S shield;



    protected BaseHero(int health, String name, W weapon, S shield) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.damage());

    }

    public boolean hit(BaseHero recepient){
        int damage = damageFork();

        return ! recepient.reduceHealth(damage);


    }

    public boolean reduceHealth(int damage){
        health -= damage;
        return health>0;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
    public S getShield() {
        return  shield;
    }
    public void setShield(S Shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                ", shield=" + shield +
                '}';
    }
}
