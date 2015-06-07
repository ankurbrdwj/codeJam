/**
 * 
 */
package com.ankur.practice.extreme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author ankurbrdwj
 *
 */
public class StandingOvation {

	private static String inputFile = "C:/Java/EclipseWorkspaces/Algorithms/extreme/src/main/resources/StandingOvation/largepractice.in";
	
	private static String outputFile = "C:/Java/EclipseWorkspaces/Algorithms/extreme/src/main/resources/StandingOvation/largeOutput.txt";

	private static Scanner scanner;
	/**
	 * 
	 */
	public StandingOvation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		int[] audience = null;
		FileOutputStream out=null;
		PrintWriter pw = null;
		String line = "";
		// TODO Auto-generated method stub
		Scanner scan = null;
		try {
			scanner = new Scanner(new File(inputFile));
			scan = scanner.useDelimiter("\n");
			out=new FileOutputStream(outputFile);
			pw=new PrintWriter(out);
			line = scan.nextLine().replace("\n", "").replace("\r", "");
			Integer numTestCases = Integer.valueOf(line);
			for (int i = 0; i < numTestCases; i++) {
				int missing = 0;
				int peopleStanding = 0;
				String[] test = scan.nextLine().split("\\s");
				String beforeSplit = test[1].replaceAll("\\[|\\]|\\s", "");
				String[] split = beforeSplit.split("");
				audience = new int[split.length];
				for (int j = 0; j < split.length; j++) {
					audience[j] = Integer.parseInt(split[j]);
				}

				peopleStanding = audience[0];
				for (int k = 1; k < audience.length; k++) {
					if (audience[k]!=0){
					if (peopleStanding >= k) {
						peopleStanding += audience[k];
					} else {
						missing += k - peopleStanding;
						peopleStanding +=  k - peopleStanding;
					
					}
					}
				}
				System.out.println("Case #" + (i+1) + ": " + missing);
				pw.write("Case #" + (i+1) + ": " + missing+"\n");
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			pw.close();
			scan.close();
			
		}
	}
}
