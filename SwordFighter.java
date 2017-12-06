public class SwordFighter extends Protagonist{

    public SwordFighter(String moniker) {
	name = moniker;
	setHP(125);
	setStrength(100);
	setDefense(40);
	setAttack(0.4);
    }

    public String toString() {
    	return
    	super.toString() + System.lineSeparator()
    	+ "Class: Swordfighter";
    }
}
	
