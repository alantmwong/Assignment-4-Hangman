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
	private RandomGenerator rgen = RandomGenerator.nextInt(10);
	
    public void run() {
    	setupGame();
		playGame();
	}
    private void setupGame(){
    	hangmanWords.getWord(rgen);
    	println("Welcome to Hangman!");
    	
    	
    }
    private void playGame(){
    	
    }
    
    private String chooseRandomWord(){
    	return "String";
    }
}
	