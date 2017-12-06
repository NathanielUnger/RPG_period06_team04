public class Ninja extends Protagonist {

    public Ninja(String moniker) {
	name = moniker;
	setHP(75);
	setStrength(150);
	setDefense(20);
	setAttack(0.6);
    }

    public String toString() {
    	return
    	super.toString() + System.lineSeparator()
    	+ "Class: Ninja";
    }
}
