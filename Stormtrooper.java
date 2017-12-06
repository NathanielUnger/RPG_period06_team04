public class Stormtrooper extends Monster {
    public Stormtrooper() {
	setHP(125);
	setStrength((int) Math.random()*45 + 50);
	setDefense((int)  Math.random()*10 + 15);
	setAttack(.8);
    }

    public String toString() {
    	return super.toString() + System.lineSeparator() +
    	"Class: Stormtrooper";
    }
}
