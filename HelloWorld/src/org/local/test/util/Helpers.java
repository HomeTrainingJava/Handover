package org.local.test.util;

import java.io.IOException;
import java.io.InputStreamReader;

public class Helpers {
	private final static int letterArrayLength = 6;
	private Helpers(
	InputStreamReader inReader = new InputStreamReader(System.in);
	try {			   				
		//Create phrase with pattern symbols
		StringBuilder strBuilder = new StringBuilder();			
		String[] letterH = getLetterH().split("\n");
		String[] letterE = getLetterE().split("\n");
		String[] letterL = getLetterL().split("\n");
		String[] letterO = getLetterO().split("\n");
		String[] letterW = getLetterW().split("\n");
		String[] letterR = getLetterR().split("\n");
		String[] letterD = getLetterD().split("\n");
		String[][] wholeWord = {letterH, letterE,letterL,letterL,letterO,letterW,letterO,letterR,letterL,letterD};
		String joinedLetter = "";					
		for (int i=0;i<letterArrayLength; i++){				
			for (int j=0;j<wholeWord.length; j++){
				String[] currentLetterArray = wholeWord[j];					
				if (currentLetterArray.length > i) 
				{
					strBuilder.append(currentLetterArray[i]);
					strBuilder.append(" ");
				}
			}
			strBuilder.append("\n");
		}	
		String phrase = strBuilder.toString();
		//Ask user for its own symbol
		System.out.println("Would you like to type Hello World?\nWhat kind of symbol would you like to choose?");
		char symbol=(char)inReader.read();//TODO What if user types in console something that won't be able turned into char? f.e '+++'
		//make swap to retrieved symbol
		phrase=swapSymbols(phrase,symbol);//TODO why is the symbol with defined value used here? here should be the symbol which is defined by user in console
		//print out phrase
		System.out.println(phrase);			
	 }catch ( IOException e){
		 System.err.println("During console read the following error occured:\n"+ e.getMessage());		
	 }finally{
		 try {
			inReader.close();
		} catch (IOException e) {
			System.err.println("The following error occured during attempt to close console read stream:\n"+ e.getMessage());			
		}
	 }
}
}