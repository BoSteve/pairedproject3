package com.techelevator;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("alices_adventures_in_wonderland.txt");
		
		int wordCount = 0;
		int sentenceCount = 0;
		
		try ( Scanner fileScanner = new Scanner( file ) ) {
			
			while ( fileScanner.hasNextLine()) {
				String nextLine = fileScanner.nextLine();
				String singleSpace = nextLine.replaceAll("\\s+", " ");
				String[] words = singleSpace.split(" ");
			
				for ( String w : words) {

					if (w.contains(".") || w.contains("?") || w.contains("!")) {
						sentenceCount++;
					}
				}
			
			
			
			
			}
			
			
		
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		

	}


