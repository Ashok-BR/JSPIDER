package Test_1;

public class TeenSum {
	public static int check(int a)
	{
		if(a>=13 && a<19)
		{
			if(a==15||a==16)
			{
				return a;
			}
			return 0;
		}
		return a;
	}
	public static void main(String args[])
	{
		System.out.print(check(5)+check(17)+check(7));
	}

}
