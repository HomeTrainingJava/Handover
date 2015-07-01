package org.local.test;
import java.io.*;
public class HW {
		
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		char symbol;
		System.out.println("¬ведите данные");
		 try {
			symbol=(char)input.read();//TODO What if user types in console something that won't be able turned into char? f.e '+++'  			
			//System.out.println(symbol);
		}catch ( IOException e){
			System.err.println("During console read the following error occured:\n"+ e.getMessage());	
		}
		 	Char sign="!";//TODO why has that variable been created? 	 	
			String phrase= getLetterH()+
							getLetterE()+
							getLetterL()+
							getLetterL()+
							getLetterO()+
							getLetterW()+
							getLetterO()+
							getLetterR()+
							getLetterL()+
							getLetterD();
		 String letter=swapSymbols(phrase,sign);//TODO why is the symbol with defined value used here? here should be the symbol which is defined by user in console
		System.out.println(letter);
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
		String denomination ("*");
		word.replaceAll(denomination,Character.toString(symbol));
		return word;
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