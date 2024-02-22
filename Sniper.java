package hw_oop_sem2;

public class Sniper extends UnitBase {
    int accuracy; //точность
    int disguise; // маскировка

    public Sniper(int x,int y,String name, int health, int stamina, int weapon, int accuracy, int disguise) {
        super(x,y,name, health, stamina, weapon);
        this.accuracy = accuracy;
        this.disguise = disguise;
    }
    public Sniper(int x,int y,String name) {
        super(x,y,name, 10, 4, 5);
        this.accuracy = 3;
        this.disguise = 4;
    }
    @Override
    public String toString() {
        return "Sniper '" +
                name + '\'' +
                position.toString();
    }
}


