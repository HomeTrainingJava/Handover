package org.local.test;
import java.io.IOException;
import java.io.InputStreamReader;
import org.local.test.utils.HWUtils;

public class HW {
	
	public static void main(String[] args) {
		InputStreamReader inReader = new InputStreamReader(System.in);		
		String phrase=new String(HWUtils.getWholeWord());
		try {
			System.out.println("Would you like to type Hello World?\nWhat symbol would you like to choose?");
			char symbol=(char)inReader.read();//TODO What if user types in console something that won't be able turned into char? f.e '+++'
			//make swap to retrieved symbol
			phrase=HWUtils.swapSymbols(phrase,symbol);
			//TODO why is the symbol with defined value used here? here should be the symbol which is defined by user in console
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
	
