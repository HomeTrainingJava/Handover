package org.local.test;
import java.io.*;
public class HW {
	private static final char patternSymbol='*';
	private final static int letterArrayLength = 5;
	public static void main(String[] args) {
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
			}			
			strBuilder.append("\n");
			String phrase = strBuilder.toString();
			//Ask user for its own symbol
			System.out.println("¬ведите данные");
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
	
	private static String swapSymbols(String word, char symbol){
		
		//преобразование char to string
		 /*char[] symbols={symbol};
		 String symbolStr= new String(symbols);*/
		 //замена подстроки + преобразование char to string;
		//преобразование char to string
		 /*char[] symbols={symbol};
		 String symbolStr= new String(symbols);*/
		 //замена подстроки + преобразование char to string
		return word.replace(patternSymbol,symbol);		
	}
	
		protected static String getLetterO() {
		// TODO Auto-generated method stubФ
		String letterO=   " * \n* *\n* *\n* *\n * ";
		return letterO;
	}	

	private static String getLetterL() {
		// TODO Auto-generated method stub
		String letterL=   "*  \n*  \n*  \n*  \n***";
		return letterL;
				
	}

	private static String getLetterE() {
		// TODO Auto-generated method stub
		String letterE=   "***\n*  \n***\n*  \n***";
		return letterE;
	}

	private static String getLetterH() {
		// TODO Auto-generated method stub
		 String letterH =   "* *\n* *\n***\n* *\n* *";
		 return letterH;
	}
	
	private static String getLetterR(){
		String letterR=   "****\n* *\n***\n** \n* *";		
		return letterR;
	}

	private static String getLetterW(){
		String letterW=   "* *\n***\n* *";		
		return letterW;
	}	
	private static String getLetterD(){
		String letterD=   "***\n****\n***";			
		return letterD;
	}

	
}	