package com.techelevator;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("alices_adventures_in_wonderland.txt");
		
		int wordCount = 0;
		int sentenceCount = 0;
		
		try ( Scanner fileScanner = new Scanner(file)) {
			
			FileInputStream fis = new FileInputStream(file);
			byte[] bytesArray = new byte[(int) file.length()];
			fis.read(bytesArray);
			String s = new String(bytesArray);
			String[] data = s.split("\\s+");
			for (int i = 0; i < data.length; i++) {
			wordCount++;
			}
			
			while ( fileScanner.hasNextLine()) {
				String nextLine = fileScanner.nextLine();
				String[] words = nextLine.split("\\s+");
				for (String w : words) {
//					if (w.contains("")) {
//						wordCount++;
//					}
					if (w.contains(".") || w.contains("?") || w.contains("!")) {
						sentenceCount++;
					}
			
				}
			}
			System.out.println("Word Count: " + wordCount);
			System.out.println("Sentence Count: " + sentenceCount);
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	}


