package Test_1;

import java.util.Scanner;

public class Alphabet_chek {

	public static void check(char c) {
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			System.out.println("The given Character is alphabet");

		}
		System.out.println("The given character is not an alphabet");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		check(ch);
		s.close();
	}

}
