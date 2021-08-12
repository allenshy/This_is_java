package com.allen;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		int n=0, all=0 ;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("1 add to ?");
		
		n = scn.nextInt();
		
		for(int i=0; i<=n; i++) {
			
			all = all + i;
			
		}
		System.out.println("Á`¦@¬O" + all);
		
	}

}
