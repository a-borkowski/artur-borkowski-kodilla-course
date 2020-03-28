package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {

    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() > 2)
                return name;
            System.out.println("Name too short, try again.");
        }
    }

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of rounds: ");
            String s = scanner.nextLine().trim();
            try {
                int n = Integer.parseInt(s);
                if (n <= 0 || n > 9)
                    throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println("Wrong number, try again.");
            }
        }
    }

    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move (S-Scissors, R-Rock, P-Paper, Q-Quit): ");
            String s = scanner.nextLine().trim().toUpperCase();
            switch (s) {
                case "S":
                    return UserSelection.SCISSORS;
                case "R":
                    return UserSelection.ROCK;
                case "P":
                    return UserSelection.PAPER;
                case "Q":
                    return UserSelection.QUIT;
                default:
                    System.out.println("Wrong selection, try again.");
            }
        }
    }

    public static void showStatisticsOne (String name, int round, int numberOfRounds, int humanScore, int aiScore, Winner winner, UserSelection userSelection, UserSelection aiSelection) {
        System.out.println("This is round number: " + round + " from " + numberOfRounds);
        System.out.println("Who chose what: " + name + ": " + userSelection + " -- Computer: " + aiSelection);
        System.out.println("In this round wins: " + winner);
        System.out.println("Result after round " + round + ": " + name + " " + humanScore + " -- " + "Computer " + aiScore + "\n");
    }

    public static void showStatisticsTwo(String name, int round, int numberOfRounds, int humanScore, int aiScore) {
        if (humanScore > aiScore)
            System.out.println("After " + numberOfRounds + " rounds THE WINNER is: " + name + "\n");
        else if (humanScore < aiScore)
            System.out.println("After " + numberOfRounds + " rounds THE WINNER is: " + "Computer" + "\n");
        else
            System.out.println("After " + numberOfRounds + " rounds no one has won." + "\n");
    }

    public static void getUserSelectionPlayAgainOrQuit() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Are we playing again of finish? (P-Play, Q-Quit): ");
            String s = scanner.nextLine().trim().toUpperCase();
            switch (s) {
                case "P":
                    Game game = new Game();
                    game.playGame();
                case "Q":
                    System.out.println("Thank you for your game !!!");
                    return;
                default:
                    System.out.println("Wrong selection, try again.");
            }
        }
    }
}