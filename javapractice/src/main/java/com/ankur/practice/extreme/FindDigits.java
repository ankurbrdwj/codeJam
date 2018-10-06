/**
 * 
 */
package com.ankur.practice.extreme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ankurbrdwj
 *
 */
public class FindDigits {

	/**
	 * 
	 */
	public FindDigits() {
		// TODO Auto-generated constructor stub
	}

private static Scanner scanner;
	public static void main(String[] args) {
		try {
			scanner = new Scanner(System.in);
			scanner = scanner.useDelimiter("\n");
			while(scanner.hasNext()){
				String firstLine=scanner.nextLine().trim();
				int numCases=Integer.parseInt(firstLine);
				for(int i=0;i<numCases;i++ ){
					String input=scanner.nextLine();
					ArrayList<Integer> list=new ArrayList<Integer>();
					String[] split =input.split("");
					for(int j=0;j<split.length;j++){
						if(Integer.parseInt(split[j])%Integer.parseInt(split[j])==0){
							list.add(Integer.parseInt(split[j]));
						}

					}
					System.out.println(list.size());
				}

			}
			scanner.close();
}catch(Exception e){
	
}
	}
}
