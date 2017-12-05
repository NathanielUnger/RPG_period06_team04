public class Protagonist extends Character {

    public String name;

    public Protagonist(String moniker) {
	name = moniker;
	setHP(125);
	setStrength(100);
	setDefense(40);
	setAttack(0.4);
    }

    public String getName() {
    return name;
    }

    public void specialize() {
    setDefense((int) (getDefense()*.75));
    setAttack(getAttack()*1.3333);
    }

    public void normalize() {
    setDefense(40);
    setAttack(0.4);
    }

 //    public boolean isAlive() {
	// return hp>=0;
 //    }

 //    public int getDefense() {
	// return defense;
 //    }

 //    public int getHP() {
 //        return hp;
 //    }

 //    public void lowerHP(int ouch) {
	// hp -= ouch;
 //    }

 //    public int attack(Monster mash) {
	// int ouch = (int) (strength*attack) - mash.getDefense();
 //    // if (ouch <= 0) {
 //    //     ouch = 1;
 //    // }
 //    mash.lowerHP(ouch);
 //    return ouch;
 //    }

}
