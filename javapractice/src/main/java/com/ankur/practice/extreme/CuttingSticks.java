/**
 * 
 */
package com.ankur.practice.extreme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ankurbrdwj
 * 
Cut the sticks

 *
 */
public class CuttingSticks {
	private static Scanner scanner;

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		try{
			scanner=new Scanner(System.in);
			scanner=scanner.useDelimiter("\n");
			String firstLine=scanner.nextLine().trim();
			int numCases=Integer.parseInt(firstLine);
			String secondLine=scanner.nextLine().trim();
			String[] split=secondLine.split("\\s");
			for(String s:split)
				list.add(Integer.parseInt(s));
			while(!list.isEmpty()){
				int smallest=list.get(0);
				for(int i=0;i<list.size();i++){
					if(smallest>list.get(i))
						smallest=list.get(i);
				}
			for(int i=0;i<list.size();i++){
				list.set(i, list.get(i)-smallest);
			}
			System.out.println(list.size());
			list.removeAll(Arrays.asList(Integer.valueOf(0)));
			}
		}catch(IllegalArgumentException ie){		
		}finally{
scanner.close();
		}

	}

}
