package com.allen;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		System.out.println("X的n次方");
		Scanner scanner = new Scanner(System.in);

		double x, n, ans;
		
		System.out.println("X是多少");
		x = scanner.nextDouble();
		
		System.out.println("n是多少");
		n = scanner.nextDouble();

		ans = operation(x, n);
		System.out.println("答案是" + ans);

	}

	public static double operation(double x, double n) {
		double Ans = 1;
		if (n == 0)
			return Ans = 1;

		for (int i = 0; i < n; i++) {
			Ans = Ans * x;
		}
		return Ans;
	}

}
