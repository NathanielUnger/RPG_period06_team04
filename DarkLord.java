public class DarkLord extends Monster {
    public DarkLord() {
	setHP(200);
	setStrength((int) Math.random()*45 + 20);
	setDefense((int) Math.random()*10 + 25);
	setAttack(0.6);
    }

    public String toString() {
    	return super.toString() + System.lineSeparator() +
    	"Class: Dark Lord";
    }
}
