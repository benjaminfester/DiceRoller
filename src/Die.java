public class Die {

    private int value;

    public Die() {

        value = (int)(Math.random() * 6 + 1);
    }

    public void roll() {
        double randomNum = Math.random();
        value = (int)(randomNum * 6 + 1);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        value = newValue;
    }

    public String toString() {
        String res = " "+ value;
        return res;
    }
}

class UseDie {
    public static void main(String []args) {

        Die die1 = new Die();
        boolean six = false;
        int numRolls = 0;

        while(six==false) {
            die1.roll();
            numRolls = numRolls + 1;
            System.out.println("Roll #" + numRolls + ": " + die1.getValue());
            if (die1.getValue() == 6)  six = true;
        }
        System.out.println("You rolled 6 after " + numRolls+ " rolls.");
    }
}


