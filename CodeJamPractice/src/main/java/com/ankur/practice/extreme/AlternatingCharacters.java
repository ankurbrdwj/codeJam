package com.ankur.practice.extreme;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlternatingCharacters {


	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		scanner = scanner.useDelimiter("\n");
		int count=0;
		List<String> list=new ArrayList<String>();
		int numTestCases=Integer.parseInt(scanner.nextLine().trim());
		for(int i=0;i<numTestCases;i++){
			String input=scanner.nextLine().trim();
			String[] split=input.split("");
			list=Arrays.asList(split);
			List<String> word=new ArrayList<String>(list);
			for(int k=1;k<word.size();k++){
					if(word.get(k-1).equals(word.get(k))){
						//word.remove(k-1);
						count++;
					}
			}
			System.out.println(count);
			count=0;
		}
		scanner.close();
	}

}
