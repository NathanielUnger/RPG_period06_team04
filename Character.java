public class Character {

	private int hp;
    private int strength;
    private int defense;
    private double attack;

    public boolean isAlive() {
	return hp>=0;
    }

    public void setHP(int hitpoints) {
    	hp = hitpoints;
    }

    public void setStrength(int strong) {
    	strength = strong;
    }

    public void setDefense(int def) {
    	defense = def;
    }

    public void setAttack(double atk) {
    	attack = atk;
    }

    public int getDefense() {
		return defense;
    }

    public double getAttack() {
    	return attack;
    }

    public int getHP() {
        return hp;
    }

    public void lowerHP(int ouch) {
	hp -= ouch;
    }

    public int attack(Character other) {
	int ouch = (int) (strength*attack) - other.getDefense();
    other.lowerHP(ouch);
    return ouch;
    }

}