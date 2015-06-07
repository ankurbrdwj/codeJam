/**
 * 
 */
package com.ankur.practice.extreme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author ankurbrdwj
 *
 */
public class HouseOfPanCakes {


	private static String inputFile = "C:/Java/EclipseWorkspaces/Algorithms/extreme/src/main/resources/StandingOvation/largepractice.in";
	
	private static String outputFile = "C:/Java/EclipseWorkspaces/Algorithms/extreme/src/main/resources/StandingOvation/largeOutput.txt";

	private static Scanner scanner;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintWriter pw = null;
		String line = "";
		try {
			scanner = new Scanner(new File(inputFile)).useDelimiter("\n");
			pw=new PrintWriter(outputFile);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			pw.close();
			scanner.close();
			
		}

	}

}
