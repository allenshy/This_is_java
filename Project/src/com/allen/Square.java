package com.allen;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		System.out.println("X��n����");
		Scanner scanner = new Scanner(System.in);

		double x, n, ans;
		
		System.out.println("X�O�h��");
		x = scanner.nextDouble();
		
		System.out.println("n�O�h��");
		n = scanner.nextDouble();

		ans = operation(x, n);
		System.out.println("���׬O" + ans);

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
