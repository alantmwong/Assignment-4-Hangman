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
	// Initializing the word guess string
	String wordState = "";
	String newWordState;
	String guess;
	
	// Secret word
	String secretWord;
	
	public void run() {
		setupGame();
		playGame();
	}
	private void setupGame(){

		// Introducing the game
		println("Welcome to Hangman!");
		
		// Getting the secret word from HangmanLexicon through hangmanWords
		secretWord = hangmanWords.getWord(rgen.nextInt(10));
		
		// making the hint
		for (int i = 0; i < secretWord.length(); i++) {
			wordState += "-";
		}
		println(wordState);
		

	}
	private void playGame(){
		
		while (guessesLeft != 0 || wordState != secretWord) {
			println("The word now looks like this: " + wordState);
			// get guess from the user
			guess = readLine("Your guess: ");
			guess.toUpperCase();
			checkGuess();
			
		}
	}
	
	private boolean checkLetter() {
		if (guess.length() == 1) { // making sure the guess is a single character
			// converting string to char
			char guessChar = guess.charAt(0);
			if (Character.isLetter(guessChar)) { // making sure guess is a letter
				Character.toUpperCase(guessChar);
				// looping through secretWord to find matching letters to the guess
				for (int i = 0; i < secretWord.length(); i++) {
					if (Character.toUpperCase(guessChar) == 
						Character.toUpperCase(secretWord.charAt(i)) && i != 0) {
						wordState = wordState.substring(0, i) + guess + wordState.substring(i+1);
					} else if (Character.toUpperCase(guessChar) == 
						Character.toUpperCase(secretWord.charAt(i)) && i == 0) {
						wordState = guess + wordState.substring(i+1);
					}
				}
			} else {
				println("Error - guess was not a letter.");
			} 
		} else {
			println("Error - guess was not a single letter.");
		}
	}
}
