package com.allen;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int Score = input.nextInt();
		
		switch(Score/10) {
			case 10:
				System.out.println("�r��");
				break;
			case 9:
				System.out.println("�]�O�r");
				break;
			case 8:	
				System.out.println("�p�r");
				break;
			case 7:
				System.out.println("�p�p�r");
				break;
			case 6:	
				System.out.println("��n�r");
				break;
			default:
				System.out.println("�T");
				break;
				
		}
		
		
		
		
	}

}
