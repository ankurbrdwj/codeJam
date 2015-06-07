/**
 * 
 */
package com.ankur.practice.extreme;

import java.util.Scanner;

/**
 * @author ankurbrdwj
 *
 */
public class HalloweenParty {

	private static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			scanner=new Scanner(System.in);
			scanner=scanner.useDelimiter("\n");
			String firstLine=scanner.nextLine().trim();
			int input=Integer.parseInt(firstLine);
			while(scanner.hasNextLine()){
			for(int i=0;i<input;i++){
				long testCase=Integer.parseInt(scanner.nextLine().trim());
				long xAxisCuts=testCase/2;
				long yAxisCuts=testCase-xAxisCuts;
				long output=xAxisCuts*yAxisCuts;
				System.out.println(output);
			}
			}
	}catch(IllegalArgumentException ie){
		}finally{
			scanner.close();
		}
	}

}
