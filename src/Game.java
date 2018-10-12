import java.util.ArrayList;

public class Game {

    public ArrayList<Player> players;

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    private Cup cup;

    public Game(int numPlayers, int numDice) {

        cup = new Cup(numDice);

        players = new ArrayList<Player>();
        for (int i = 0; i<numPlayers; i++) {
            Player p = new Player("Benjamin");
            players.add(p);
        }
    }

    public void addPlayer(Player p) {
        players.add(p);
    }
}

class PlayGame {
    public static void main(String[] arg) {

        Game game = new Game(3,3);

        int scoreToWin = 150;
        boolean winCondish = false;
        int PlayerTurnIndex = 0;

        while (winCondish == false) {

            game.getCup().shake();
            game.players.get(PlayerTurnIndex).setScore(game.players.get(PlayerTurnIndex).getScore() + game.getCup().sum());
            game.players.get(PlayerTurnIndex).incrementNumTries();
            System.out.println("Player # "+PlayerTurnIndex+" rolled: " + game.getCup() + " and the score is: " + game.players.get(PlayerTurnIndex).getScore());
            if (game.getCup().numShowing(1) == 2) {
                game.players.get(PlayerTurnIndex).setScore(0);
            }
            if (game.players.get(PlayerTurnIndex).getScore() >= scoreToWin) {
                winCondish = true;
            } else {
                PlayerTurnIndex++;
                if(PlayerTurnIndex >= game.players.size()) {
                    PlayerTurnIndex = 0;
                }
            }
        }
        System.out.println("Player "+PlayerTurnIndex+ " won  after  " + game.players.get(PlayerTurnIndex).getNumTries() + " tries");
    }
}