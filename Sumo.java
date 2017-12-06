public class Sumo extends Protagonist {

    public Sumo(String moniker) {
	name = moniker;
	setHP(200);
	setStrength(50);
	setDefense(75);
	setAttack(0.2);
    }

    public String toString() {
    	return
    	super.toString() + System.lineSeparator()
    	+ "Class: Sumo wrestler";
    }
}
