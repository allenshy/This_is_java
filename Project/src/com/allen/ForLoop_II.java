package com.allen;

import java.util.Scanner;

public class ForLoop_II {

	public static void main(String[] args) {

		int x=0;
		int i=1;
		Scanner sca =new Scanner(System.in);
		
		System.out.println("總共是?");
		x = sca.nextInt();
		
		for(i=1; i<=x; i++) {
			x = x-i;
		}
		
		System.out.println("他是從1加到" + (i-1));
		System.out.println("但是多了" + x);
		
		
		
		
		
		
		
		
	}

}
