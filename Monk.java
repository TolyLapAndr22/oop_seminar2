package hw_oop_sem2;

public class Monk extends UnitBase {
    String faith; // вера
    int enlightenment; // просветление
    int healing;//целительство

    public Monk(int x,int y,String name, int health, int stamina, int weapon, String faith, int enlightenment, int healing) {
        super(x,y,name, health, stamina, weapon);
        this.faith = faith;
        this.enlightenment = enlightenment;
        this.healing = healing;
    }

    public Monk(int x,int y,String name ) {
        super(x,y,name, 10, 4, 6);
        this.faith = "christianity";
        this.enlightenment = 7;
        this.healing = 8;
    }

    @Override
    public String toString() {
        return "Monk '" +
                name + '\'' +
                position.toString();
    }
}
