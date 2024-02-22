package hw_oop_sem2;

/*
поля данных
- сила - strength
- ловкость - agility
 поля поведения
 - work
 */
public class Peasant extends UnitBase {
 int strength;//сила
 int agility;//ловкость

 public Peasant(int x,int y,String name, int health, int stamina, int weapon, int strength, int agility) {
  super(x,y,name, health, stamina, weapon);
  this.strength = strength;
  this.agility = agility;
 }
 public Peasant(int x,int y,String name) {
  super(x,y,name, 10, 4, 3);
  this.strength = 5;
  this.agility = 3;
 }
 @Override
 protected void attack(UnitBase target) {
  int damage = UnitBase.r.nextInt(1,5)*strength*agility;
  target.GetDamage(damage);
 }
 public void work(int hour){
  stamina-= hour /4;
 }

 @Override
 public String toString() {
  return "Peasant '" +
          name + '\'' +
          position.toString();
 }
}
