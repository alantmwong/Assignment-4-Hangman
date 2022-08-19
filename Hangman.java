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
	
    public void run() {
    	setupGame();
		playGame();
	}
    private void setupGame(){
    	String secretWord = hangmanWords.getWord(rgen.nextInt(10));
    	println("Welcome to Hangman!");
    	println("The word looks like this")
    	
    }
    private void playGame(){
    	
    }
    
    private String chooseRandomWord(){
    	return "String";
    }
}
	