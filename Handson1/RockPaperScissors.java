package com.upgrad.c1.Handson1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int myChoice = 0, myScore = 0, computerScore = 0, computerChoice = 0, roundNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello! " + name + ", Now Starting Game:");

        do {

            roundNumber++;
            System.out.println("Round number:" + roundNumber);
            System.out.println("Here are the scores so far...");
            System.out.println("Computer Score: " + computerScore);
            System.out.println(name + " : " + myScore);
            do {
                System.out.println("1. for Rock, 2. For Paper, 3. For Scissors ");
                int ch = input.nextInt();
                switch (ch) {
                    case 1:
                        myChoice = 1;
                        System.out.println(name + " chooses rock");
                        break;
                    case 2:
                        myChoice = 2;
                        System.out.println(name + " chooses paper");
                        break;
                    case 3:
                        myChoice = 3;
                        System.out.println(name + " chooses scissors");
                        break;

                }
            } while (!(myChoice >= 1 && myChoice <= 3));

            System.out.println("Computer will choose an option:");
            Random random = new Random();
            int compOption = random.nextInt(3) + 1;
            switch (compOption) {
                case 1:
                    computerChoice = 1;
                    System.out.println("Computer chooses Rock" + compOption);
                    break;
                case 2:
                    computerChoice = 2;
                    System.out.println("Computer chooses Paper" + compOption);
                    break;
                case 3:
                    computerChoice = 3;
                    System.out.println("Computer chooses Scissors" + compOption);
                    break;
            }
            switch (myChoice) {
                case 1:
                    switch (computerChoice) {
                        case 1:
                            System.out.println("This is a draw");
                            break;
                        case 2:
                            computerScore++;
                            System.out.println("Computer wins");
                            break;
                        case 3:
                            myScore++;
                            System.out.println(name + " wins");
                            break;
                    }
                    break;
                case 2:
                    switch (computerChoice) {
                        case 1:
                            myScore++;
                            System.out.println(name + " wins");
                            break;
                        case 2:
                            System.out.println("This is a draw");
                            break;
                        case 3:
                            computerScore++;
                            System.out.println("Computer wins");
                            break;
                    }
                    break;
                case 3:
                    switch (computerChoice) {
                        case 1:

                            computerScore++;
                            System.out.println("Computer wins");
                            break;
                        case 2:
                            myScore++;
                            System.out.println(name + " wins");
                            break;
                        case 3:

                            System.out.println("This is a draw");
                            break;
                    }
                    break;
            }
        } while (myScore != 5 && computerScore != 5);

        System.out.println("<------------------Game Over----------------->");
        if (myScore == 5) {
            System.out.println("You Win");
        } else {
            System.out.println("Computer wins");
        }
        input.close();

    }
}
