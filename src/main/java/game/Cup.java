package game;

import java.util.ArrayList;

public class Cup {

    private ArrayList<Die> dice;

    public Cup(int numDice) {
        dice = new ArrayList<>();
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

        int result = 0;
        for (Die d : dice) {
            int dieValue = d.getValue();
            result = result + dieValue;
        }
        return result;
    }

    public int numDiceShowingFaceValue(int facevalue) {
        int result = 0;
        for (Die d : dice) {
            int dieValue = d.getValue();
            if (dieValue==facevalue) {
                result = result + 1;
            }
        }
        return result;
    }

    public String toString() {
        return dice.toString();
    }

    public Die getDie(int i) {
        return dice.get(i);
    }
}


