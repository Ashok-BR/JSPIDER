package Test_1;

public class Increment {
	public static void inc()
	{
		int a=10;
		int b=30;
		a++;
		System.out.println(a);
		int c= a+ ++b;
		System.out.println(c);
//		a++;
//		System.out.println(a++);
//		System.out.println(a);
//		for(char ch='a';ch<='z';ch++)
//		{
//			System.out.println(ch);
//		}
//			
	}
	public static void main(String[] args) {
//		inc();
		int a = 10, b= 10;
		System.out.println(a++ + 10 / b - 28 + ++b);
	}
}
