package hw_oop_sem2;

public class Outlaw extends UnitBase {
    int trick; // хитрость
    int dexterity; //ловкость

    public Outlaw(int x,int y,String name, int health, int stamina, int weapon, int trick, int dexterity) {
        super(x,y,name, health, stamina, weapon);
        this.trick = trick;
        this.dexterity = dexterity;
    }

    public Outlaw(int x,int y,String name) {
        super(x,y,name, 10, 4, 5);
        this.trick = 4;
        this.dexterity = 5;
    }
    @Override
    public String toString() {
        return "Outlaw '" +
                name + '\'' +
                position.toString();
    }
}
