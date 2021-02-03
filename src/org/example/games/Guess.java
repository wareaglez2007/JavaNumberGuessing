package org.example.games;

/**
 * @author Rostom Sahakian
 * MFI - Class IRS
 * Java coding Assignment 1
 * 02-01-2021
 * We are going to build a game in Java
 * this game will NOT be run on the Machine
 *
 */

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Guess {

	/**
	 * @param args
	 *            Game Rules: - the game will pick a random number between 1 and
	 *            1000 - the player gets 10 tries to guess the number - the game
	 *            will respond to each guess with: .Too High or .Too Low or .You
	 *            Win - if the player does not guess the number in 10 tries the
	 *            game is over, and the game should display the answer
	 */

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);

		// generate a random number between 1 and 1000
		// the nextInt(1000) will give me a number 0-999
		// so I add 1

		// TODO Output a welcome message
		System.out.println("Greetings\n "
				+ "We are going to play a number guessing game.\n"
				+ "Please guess a number between 1 and 1000.\n");
		int answer = rand.nextInt(1000) + 1;
		//System.out.println(answer + "\n"); //Testing purposes
		// the game loop
		// TODO write a while loop to play the game
		boolean winner = false;
		int userTries = 1;
		while (userTries <= 10) {
			// TODO output a prompt asking the user to enter a guess

			int guess = in.nextInt();

			// Warn user that number must be between 1 and 1000
			if ((guess < 0) || (guess > 1000)) {

				System.out.println("Try#"
						+ userTries
						+ ") Warning! Your guess MUST be between 1 and 1000. \nYou have entered: "
						+ guess + "\n try again:\n");
				//
				// TODO check if the user's guess is
				// too low, too high or correct
				// if correct, break out of the loop
			} else if (guess > answer) {
				System.out.println("Try#" + userTries
						+ ") Your Guess is too high.\n");

			} else if (guess < answer) {
				System.out.println("Try#" + userTries
						+ ") Your Guess is too low.\n");

			} else if (guess == answer) {

				winner = true;
				userTries = 10;
			}

			// TODO increment the attempts counter
			userTries++;
		} // end of loop

		// TODO if user wins ....
		if (winner) {
			System.out.println("Nice job you guessed it correct.\n"
					+ "Correct Answer is " + answer);
		} else {
			// TODO if the user DID NOT win the game
			System.out
			.println("Sorry you have reached the guessing limit of 10.\n"
					+ "The Correct Answer was " + answer);
		}
		// output the answer

		in.close();
	} // end of main()
}
