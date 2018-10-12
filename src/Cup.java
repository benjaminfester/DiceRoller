import java.util.ArrayList;

public class Cup {

    public ArrayList<Die> dice;

    public Cup(int numDice) {
        dice = new ArrayList<Die>();
        for (int i = 0; i<numDice; i++) {
            Die d = new Die();
            dice.add(d);
        }
    }

    public void addDie(Die d) {
        dice.add(d);
    }

    public void shake() {
        for (Die d : dice) {
            d.roll();
        }
    }

    public int sum() {

        int result;
        result = 0;
        for (Die d : dice) {
            int dieValue = d.getValue();
            result = result + dieValue;
        }
        return result;
    }

    public int numShowing(int value) {
        int result = 0;
        for (Die d : dice) {
            int dieValue = d.getValue();
            if (dieValue==value) {
                result = result + 1;
            }
        }
        return result;
    }

    public String toString() {
        return dice.toString();
    }
}


