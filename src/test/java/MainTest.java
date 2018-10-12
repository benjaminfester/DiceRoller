import game.Cup;
import game.Die;


import static org.junit.Assert.*;

public class MainTest {
    Die die = new Die();

    @org.junit.Test
    public void roll() {

    int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, fejl = 0;

    for (int i=0; i < 1000; i++) {

        die.roll();

        switch (die.getValue()) {

            case 1: a1++;
                break;
            case 2: a2++;
                break;
            case 3: a3++;
                break;
            case 4: a4++;
                break;
            case 5: a5++;
                break;
            case 6: a6++;
                break;
            default: fejl++;


        }


    }


        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + " " + fejl);


    }

}
