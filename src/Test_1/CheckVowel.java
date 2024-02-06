package Test_1;
import java.util.Scanner;
public class CheckVowel {
	public static void check(char c)
	{
	if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u')
	{
		System.out.println("This is Vowel");
		
	}
	else
	{
	System.out.println("This is not vowel");
	}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch=s.next().charAt(0);
		check(ch);
		s.close();
	}

}
