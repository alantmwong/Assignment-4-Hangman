/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {
	// 	instance variables
	HangmanLexicon hangmanWords = new HangmanLexicon();
	// Random number generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	// guesses left
	private int guessesLeft = 8;

	public void run() {
		setupGame();
		playGame();
	}
	private void setupGame(){

		// Introducing the game
		println("Welcome to Hangman!");
		println("The word looks like this: ");

	}
	private void playGame(){

		// Getting the secret word from HangmanLexicon through hangmanWords
		String secretWord = hangmanWords.getWord(rgen.nextInt(10));
		String wordState = "";
		String newWordState = "";

		// making the hint
		for (int i = 0; i < secretWord.length(); i++) {
			wordState += "-";

		}
		println(wordState);
		while (guessesLeft != 0 || wordState != secretWord) {
			// get guess from the user
			String guess = readLine("Your guess: ");
			if (guess.length() == 1) { // making sure the guess is a single character
				// converting string to char
				char guessChar = guess.charAt(0);

				if (Character.isLetter(guessChar)) { // making sure guess is a letter
					Character.toUpperCase(guessChar);
					// looping through secretWord to find matching letters to the guess
					for (int i = 0; i < secretWord.length(); i++) {
						
					}
				} else {
					println("Error - guess was not a letter.");
				}
			} else {
				println("Error - guess was not a single letter.");
			}
		}
	}
}
