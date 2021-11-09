package com.allen;

public class BubbleSort {

	public static void main(String[] args) {
		int ball[] = { 53, 6, 28, 13, 36 };

		int a = 0, time = ball.length - 1;

		System.out.println(ball.length);
		
		while (time != 0) {
			for (int n = 1; n < ball.length; n++) {
				if (ball[n - 1] > ball[n]) {
					a = ball[n];
					ball[n] = ball[n - 1];
					ball[n - 1] = a;
				}
			}
			time--;
		}

		for (int number : ball)
			System.out.println(number);

	}

}
