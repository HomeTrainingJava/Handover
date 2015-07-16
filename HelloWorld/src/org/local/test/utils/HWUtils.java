package org.local.test.utils;
public class HWUtils {
	private static int letterArrayLength = 0;
	private static final char patternSymbol='*';
	
	public static int getLetterArrayLength() {
		return letterArrayLength;

	}
	protected static String getLetterO() {
		// TODO Auto-generated method stub”
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
	private static String getLetter(){
		String letter=   "  \n  \n  \n  \n  ";			
		return letter;
	}
	public static String swapSymbols(String word, char symbol){
		return word.replace(patternSymbol,symbol);	
	}
	
	
	public static String getWholeWord()  {
		StringBuilder strBuilder = new StringBuilder();			
		String[] letterH = getLetterH().split("\n");
		setLetterArrayLength(letterH.length);
		String[] letterE = getLetterE().split("\n");
		String[] letterL = getLetterL().split("\n");
		String[] letterO = getLetterO().split("\n");
		String[] letterSpace = getLetter().split("\n");
		String[] letterW = getLetterW().split("\n");
		String[] letterR = getLetterR().split("\n");
		String[] letterD = getLetterD().split("\n");	
	
		String[][] wholeWord = {letterH, letterE,letterL,letterL,letterO,letterSpace,letterW,letterO,letterR,letterL,letterD};
		boolean isProcessingStop = false;
		for (int i=0;i<getLetterArrayLength(); i++){				
			for (int j=0;j<wholeWord.length; j++){
				String[] currentLetterArray = wholeWord[j];
				if (isProcessingStop = currentLetterArray.length == getLetterArrayLength()) {
					if (currentLetterArray.length > i) 
					{
						strBuilder.append(currentLetterArray[i]);
						strBuilder.append(" ");
					}
				}else{
					strBuilder = new StringBuilder("There is an issue on development level that requires involment of main developer. Exit...");
					break;
				}
			}
			if (isProcessingStop == true){
				break;
			}
			strBuilder.append("\n");
		}
		String phrase = strBuilder.toString();
		return phrase ;
		
	}
	public static void setLetterArrayLength(int letterArrayLength) {
		HWUtils.letterArrayLength = letterArrayLength;
	}
}
