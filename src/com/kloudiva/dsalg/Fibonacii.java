package com.kloudiva.dsalg;

public class Fibonacii {
	public static long fib(long pos) {
		if (pos < 0) {
			return -1;
		}
		if (pos == 1 || pos == 2) {
			return 1;
		}
		long prev1 = 1, prev2 = 1;
		long fib = 0;
		System.out.print("1, 1");
		for (int i = 2; i < pos; i++) {
			fib = prev1 + prev2;
			prev1 = prev2;
			prev2 = fib;
			System.out.print(", " + fib);
		}
		return fib;
	}

	public static void main(String[] args) {
		fib(5);
	}

	public static long fibRecursive(long pos) {

		if (pos == 1 || pos == 2) {
			return 1;
		}
		return fibRecursive(pos - 2) + fibRecursive(pos - 1);
	}

}
