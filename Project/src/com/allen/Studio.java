package com.allen;

import java.util.Scanner;

public class Studio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String str = new String("Yes");
		
		int Ans = 87;
		int In;
		
		System.out.println("0-99:");
		
		In = scanner.nextInt();
		
		if(In!=Ans)
			str = (In>Ans) ? "too big" : "too small" ;
		
		System.out.println(str);
		
		
		
		
	}

}
