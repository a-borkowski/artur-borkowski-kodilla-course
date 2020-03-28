package com.kodilla.rps;

import java.util.Random;

public class Logic {

    public static UserSelection getAISelection() {
        Random random = new Random();
        int n = random.nextInt(100);
        if (n < 33)
            return UserSelection.SCISSORS;
        else if (n > 66)
            return UserSelection.ROCK;
        else
            return UserSelection.PAPER;
    }

    public static Winner getWinner(UserSelection userSelection, UserSelection aiSelection) {
        if (userSelection == UserSelection.SCISSORS && aiSelection == UserSelection.PAPER)
            return Winner.HUMAN;
        else if (userSelection == UserSelection.PAPER && aiSelection == UserSelection.SCISSORS)
            return Winner.COMPUTER;
        else if (userSelection == UserSelection.ROCK && aiSelection == UserSelection.SCISSORS)
            return Winner.HUMAN;
        else if (userSelection == UserSelection.SCISSORS && aiSelection == UserSelection.ROCK)
            return Winner.COMPUTER;
        else if (userSelection == UserSelection.PAPER && aiSelection == UserSelection.ROCK)
            return Winner.HUMAN;
        else if (userSelection == UserSelection.ROCK && aiSelection == UserSelection.PAPER)
            return Winner.COMPUTER;
        else
            return Winner.DRAW;
    }
}