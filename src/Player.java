
public class Player {

    String name;
    int numTries;
    int score;

    public Player(String n){
        name = n;
        numTries = 0;
        score = 0;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public int getNumTries() {
        return numTries;
    }

    public void setNumTries(int numTries) {
        this.numTries = numTries;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incrementNumTries() {
        numTries++;

    }

}

















