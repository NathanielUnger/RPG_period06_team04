public class DarkWizard extends Monster {
    public DarkWizard() {
	setHp(75);
	setStrength((int) Math.random()*45 + 80);
	setDefense((int) Math.random()*10 + 5);
	setAttack(1);
    }

    public String toString() {
    	return super.toString() + System.lineSeparator() +
    	"Class: Dark Wizard";
    }
}
