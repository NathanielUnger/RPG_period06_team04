public class Monster extends Character {


    public Monster() {
	setHP(125);
	setStrength((int) Math.random()*45 + 50);
	setDefense((int)  Math.random()*10 + 15);
	setAttack(1);
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

 //    public int attack(Protagonist hero) {
	// int ouch = (int) (strength*attack) - hero.getDefense();
 //    // if (ouch <= 0) {
 //    //     ouch = 1;
 //    // }
 //    hero.lowerHP(ouch);
 //    return ouch;
 //    }

}
