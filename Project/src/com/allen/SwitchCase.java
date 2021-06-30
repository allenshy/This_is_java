package com.allen;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int Score = input.nextInt();
		
		switch(Score/10) {
			case 10:
				System.out.println("猛哥");
				break;
			case 9:
				System.out.println("也是猛");
				break;
			case 8:	
				System.out.println("小猛");
				break;
			case 7:
				System.out.println("小小猛");
				break;
			case 6:	
				System.out.println("剛好猛");
				break;
			default:
				System.out.println("掰");
				break;
				
		}
		
		
		
		
	}

}
