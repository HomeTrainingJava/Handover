package org.local.test;

public class HW {
	private static final char patternSymbol='*';
	private final static int letterArrayLength = 6;
	public static void main(String[] args) {
		import HelpersToImport;
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
		String letterO=   " ** \n*  *\n*  *\n*  *\n ** ";
		return letterO;
	}	

	private static String getLetterL() {
		// TODO Auto-generated method stub
		String letterL=     "*   \n*   \n*   \n*   \n****";
		return letterL;
				
	}

	private static String getLetterE() {
		// TODO Auto-generated method stub
		String letterE=   "****\n*   \n****\n*   \n****";
		return letterE;
	}

	private static String getLetterH() {
		// TODO Auto-generated method stub
		 String letterH =   "*  *\n*  *\n****\n*  *\n*  *";
		 return letterH; 
	}
	
	private static String getLetterR(){
		String letterR=   "****\n*  *\n* * \n*  *\n*  *";		
		return letterR;
	}

	private static String getLetterW(){
		String letterW=   "*           *\n *         * \n  *   *   *  \n   * * * *   \n    *   *    ";		
		return letterW;
	}	
	private static String getLetterD(){
		String letterD=   "*** \n*  *\n*  *\n*  *\n*** ";			
		return letterD;
	}
}	
