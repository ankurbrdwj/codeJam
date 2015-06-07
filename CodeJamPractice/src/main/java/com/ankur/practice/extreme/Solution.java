package com.ankur.practice.extreme;

import java.util.Scanner;

public class Solution {


	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			scanner = new Scanner(System.in);
			scanner = scanner.useDelimiter("\n");
			while(scanner.hasNext()){
			String firstLine=scanner.nextLine().replaceAll("(\\r|\\n|\\r\\n)", "").trim();
			String[] split=firstLine.split("\\s");
			int numTestCases=Integer.parseInt(split[1]);
			String[] secondLine=scanner.nextLine().trim().split("\\s");
			int[] width=new int[secondLine.length];
			for(int i=0; i<secondLine.length; i++)
			{
			    try{
			        width[i] = Integer.parseInt(secondLine[i]);
			    }
			    catch(NumberFormatException nfe){
			    }
			}
			for(int x=0;x<numTestCases;x++){
				String[] range=scanner.nextLine().trim().split("\\s");
				int i=Integer.parseInt(range[0]);
				int j=Integer.parseInt(range[1]);
				int smallest=width[i];
				for(int k=i;k<=j;k++){
					if(width[k]<smallest)
						smallest=width[k];
				}
				System.out.println(smallest);
			}
			}
			
		}
		finally{
			scanner.close();
	}

}
}
