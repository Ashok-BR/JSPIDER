package programming;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		print1_N(n);
		printN_1(n);
		printEven1_N(n);
		printEvenSum1_N(n);
		printSum(n);
		printMul(n);
		sc.close();
		
	}

	public static void printMul(int n) {
		long prod = 1;
		for (int i = 1; i < n; i++) {
			prod = prod * i;
		}
		System.out.println("Product: " + prod);
	}

	public static void printSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum: " + sum);

	}

	private static void printEvenSum1_N(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i += 2)
			sum += i;

		System.out.println(sum);
	}

	private static void printEven1_N(int n) {
		for (int i = 2; i <= n; i += 2)
			System.out.print(i + " ");
		System.out.println();
	}

	private static void printN_1(int n) {
		for (int i = n; i >= 1; i--)
			System.out.print(i + " ");
		System.out.println();
	}

	private static void print1_N(int n) {
		for (int i = 1; i <= n; i++)
			System.out.print(i + " ");
		System.out.println();
	}

}
