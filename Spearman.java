package hw_oop_sem2;
//Копейщик
public class Spearman extends UnitBase {
    int strength; // сила
    int protection; //защита

    public Spearman(int x,int y,String name, int health, int stamina, int weapon, int strength, int protection) {
        super(x,y,name, health, stamina, weapon);
        this.strength = strength;
        this.protection = protection;
    }
    public Spearman(int x,int y,String name) {
        super(x,y,name, 10, 5, 4);
        this.strength = 3;
        this.protection = 4;
    }

    @Override
    public String toString() {
        return "Spearman '" +
                name + '\'' +
                position.toString();
    }
}
