package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the file path>>>>");
		String path = userInput.nextLine();
		
		File originalFile = new File(path);
		
		if (!originalFile.exists()) {
			System.out.println(originalFile.getAbsolutePath() + " does not exist.");
		} else {
			
			Scanner searchWord = new Scanner(System.in);
			System.out.println("Please enter a word to search: ");
			String userWord = searchWord.nextLine();
			
			Scanner replaceWord = new Scanner(System.in);
			System.out.println("Please enter a word to replace it with: ");
			String userReplace = replaceWord.nextLine();
			
			try { 
				Scanner fileScanner = new Scanner(originalFile); 
				File newFile = new File("alices_adventures_in_wonderland2.txt");
				PrintWriter printWriter = new PrintWriter(newFile);
				while (fileScanner.hasNextLine());
				String word = fileScanner.nextLine();
				if (word.contains(userWord)) {
					word.replace(userWord, userReplace);
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("No file found");
			}
			}
		}
	}


