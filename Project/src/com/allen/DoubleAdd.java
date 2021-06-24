package com.allen;

public class DoubleAdd {

	public static void main(String[] args) {
		
		int i = 0, j = 5;
		int x = 0, y = 5;
		
		i = 1 + j++;
		x = 1 + ++y;
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
