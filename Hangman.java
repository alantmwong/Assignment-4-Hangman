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
	
    public void run() {
    	setupGame();
		playGame();
	}
    private void setupGame(){
    	println("Welcome to Hangman!");
    	
    	
    }
    private void playGame(){
    	
    }
    
    private String chooseRandomWord(){
    	return "String";
    }
}
	