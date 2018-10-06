package com.ankur.practice.extreme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		scanner = scanner.useDelimiter("\\n");

		while (scanner.hasNextLine()) {
			String out = scanner.nextLine();
			System.out.println(out);
			// System.exit(0);
		}

		scanner.close();
		System.out.close();
		System.exit(0);
	}
}
