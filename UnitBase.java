package hw_oop_sem2;

import java.util.ArrayList;
import java.util.Random;

/*
UnitBase
поля данных
-name
-health - здоровье
-stamina - выносливость
-weapon - оружие

поля поведения

-damage - повреждение
-attack - атака
-death - смерть

 */
abstract class UnitBase {
    Place position;
    protected String name;
    protected int health;
    protected  int stamina ;
    protected  int weapon;
    protected static Random r = new Random();

    public UnitBase(int x,int y,String name, int health, int stamina, int weapon) {
        position= new Place(x,y);
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.weapon = weapon;
    }
    protected void  GetDamage(int damage){
        if(this.health >0){
            this.health -=damage;
        }
    }

    protected void attack(UnitBase target){
        int damage= UnitBase.r.nextInt(health);
        target.GetDamage(damage);
    }
    protected void death(UnitBase target){
        if(target.GetHealth() <  0){
            System.out.println("You're dead");
        }
    }
    public int GetHealth(){
        return health;
    }

public String findТearУnemy(ArrayList<UnitBase> team){
        int teamIndex=-1;
        double minDist=Double.MAX_VALUE;
        for (UnitBase team2 :team){
            if (position.Distance(team2.position)< minDist){
                minDist=position.Distance(team2.position);
                teamIndex=team.indexOf(team2);
            }
        }

        return team.get(teamIndex).toString();
}

}
