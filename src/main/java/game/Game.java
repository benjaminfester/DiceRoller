package game;

import gui_fields.GUI_Field;
import gui_main.GUI;

import java.util.ArrayList;

public class Game {

    private final GUI gui;
    private ArrayList<Player> players;
    private int scoreToWin;
    private Cup cup;

    public Game(int numPlayers, int numDice, int scoreToWin) {
        gui = new GUI(new GUI_Field[0]);

        cup = new Cup(numDice);

        this.scoreToWin = scoreToWin;

        players = new ArrayList<>();
        for (int i = 0; i<numPlayers; i++) {
            Player p = new Player(gui.getUserString("Player " + (i +1) + ", indtast dit navn"));
            players.add(p);
        }
    }

    public void addPlayer(Player p) {
        players.add(p);
    }


    public void playGame() {
        //Set default values;

        boolean gameWon = false;
        int playerTurnIndex = 0;

        while (!gameWon) {

            cup.shake();
            gui.setDice(cup.getDie(0).getValue(),cup.getDie(1).getValue());
            players.get(playerTurnIndex).setScore(players.get(playerTurnIndex).getScore() + cup.sum());
            players.get(playerTurnIndex).incrementNumTries();
            gui.showMessage("Player "+players.get(playerTurnIndex).getName()+" rolled: " + cup + " and the score is: " + players.get(playerTurnIndex).getScore());
            if (cup.numDiceShowingFaceValue(1) == 2) {
                players.get(playerTurnIndex).setScore(0);
            }
            if (players.get(playerTurnIndex).getScore() >= scoreToWin) {
                gameWon = true;
            } else {
                playerTurnIndex++;
                if(playerTurnIndex >= players.size()) {
                    playerTurnIndex = 0;
                }
            }

        }
        gui.showMessage(players.get(playerTurnIndex).getName() + " won  after  " + players.get(playerTurnIndex).getNumTries() + " tries");
    }
}