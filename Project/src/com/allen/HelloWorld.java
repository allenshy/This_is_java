package com.allen;

import java.io.Console;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String s = new String ("this is string a");
		
		int i,j;

		Scanner scanner = new Scanner(System.in);
		
	
		i = scanner.nextInt();
		j = scanner.nextInt();
		
		/*k = i+j;*/
		
		System.out.println("String is ~ " + s);
		System.out.println("Ans = " + (i+j));
	}

}
