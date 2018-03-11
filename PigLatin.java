/** Program: Programming Exercise 4
 * File:PigLatin.java
 * Summary: Reads text from file and converts it to PigLatin
 * Author: Brandon Labat
 * Date: March 11, 2018
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		//variables
		String textFile = "";
		char[] textArray;

		//try-catch
		try { //begin try
			BufferedReader br = new BufferedReader(new FileReader("text.txt"));
			
			String readLine = "";
			while((readLine = br.readLine()) != null) { // while loop begins
				textFile += readLine;
			}//end while loop
			System.out.println(textFile);
			br.close();
		} // end try
		catch (IOException e) {//begin catch
			e.printStackTrace();
		}//end catch
	
		textArray = LoadArray(textFile);
		
	
	}
	public static char[] LoadArray(String textFile){
		char[] textArray = new char[2];
		int count = 0;
		
		for (int i = 0; i < 2;) {
			{
				textArray[i] = textFile.charAt(count);
				System.out.println(textArray[i]);
				System.out.printf("%-7s", textArray[i] + "ay");
				count++;
				;
				}
				
				}
			
		
		return textArray;
		
	}
}

	//end main method
	
	
				