package com.kodilla.rps;

public class Game {

    private String userName;
    private int numberOfRounds;
    private int aiScore;
    private int humanScore;

    public void playGame() {
        userName = UserDialogs.getUserName();
        numberOfRounds = UserDialogs.getNumberOfRounds();
        int round = 1;
        while (round <= numberOfRounds) {
            UserSelection userSelection = UserDialogs.getUserSelection();
            if (userSelection == UserSelection.QUIT)
                return;
            UserSelection aiSelection = Logic.getAISelection();
            Winner winner = Logic.getWinner(userSelection, aiSelection);
            if (winner == Winner.COMPUTER)
                aiScore++;
            else if (winner == Winner.HUMAN)
                humanScore++;
            else {
                aiScore++;
                humanScore++;
            }
            UserDialogs.showStatisticsOne (userName, round, numberOfRounds, humanScore, aiScore, winner, userSelection, aiSelection);
            round++;
        }
        UserDialogs.showStatisticsTwo (userName, round, numberOfRounds, humanScore, aiScore);
        UserDialogs.getUserSelectionPlayAgainOrQuit();
    }
}