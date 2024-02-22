package hw_oop_sem2;

public class Magician extends UnitBase {
    int intellect;
    int mana;

    public Magician(int x,int y,String name, int health, int stamina, int weapon, int intellect, int mana) {
        super(x,y, name, health, stamina, weapon);
        this.intellect = intellect;
        this.mana = mana;
    }
    public Magician(int x,int y,String name) {
        super(x,y, name, 10, 4, 6);
        this.intellect = 5;
        this.mana = 7;
    }

    @Override
    public String toString() {
        return "Magician '" +
                name + '\'' +
                position.toString();
    }
}
