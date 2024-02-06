package Test_1;

import java.util.Scanner;

public class Alphabet {
	public static void check(char c) {
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			System.out.println("It is alphabet");
		}
		System.out.println("It is not an alphabet");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = s.next().charAt(0);
		check(ch);
		s.close();
	}
}
