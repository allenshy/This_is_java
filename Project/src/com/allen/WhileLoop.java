package com.allen;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1, j = 0;

		while (i <= 100) {
			j = j + i;
			i++;
			continue;
		}
		System.out.println(j);

	}

}
