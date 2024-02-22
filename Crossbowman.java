package hw_oop_sem2;

import java.util.ArrayList;

public class Crossbowman extends UnitBase {
    int accuracy; // точность
    int amounOfarrows; //кол стрел

    public Crossbowman(int x,int y,String name  ) {
        super(x,y,name, 10, 5, 6);
        this.accuracy = 6;
        this.amounOfarrows = 7;
    }
    public String toString() {
        return "Crossbowman '" +
                name + '\'' +
                position.toString()
                ;
    }

    public String toString(ArrayList<UnitBase> team) {
        return "Crossbowman '" +
                  name + '\'' +
                 position.toString()+
                "enemy"+ findТearУnemy(team);
    }
}
