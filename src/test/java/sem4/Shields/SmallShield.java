package sem4.Shields;
import sem4.Shield;

public class SmallShield implements Shield {
    String shieldName;

    private int armorPoint;

    public SmallShield(String shieldName,int armorPoint ) {
        this.shieldName = shieldName;
        this.armorPoint = armorPoint;
    }

    @Override
    public String toString() {
        return "BigShield{" +
                "shieldName='" + shieldName + '\'' +
                ", armorPoint=" + armorPoint +
                '}';
    }
    @Override
    public int armor() {
        return armorPoint;
    }
}
