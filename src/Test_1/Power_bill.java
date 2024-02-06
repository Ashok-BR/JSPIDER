package Test_1;
import java.util.Scanner;
public class Power_bill {
	
	public static void PowerBill(int unit)
	{
		double bill=0;
		if(unit<100)
		{
			bill=unit*2;
		}
		else if(unit>100 && unit<200)
		{
			bill=(unit-100)*4.5+100*2;
		}
		else if(unit>200 && unit<500)
		{
			bill=(unit-200)*6+100*4.5+100*2;
		}
		else 
		{
			bill=(unit-500)*7+300*6+100*4.5+100*2;
		}
		System.out.println("Bill is:"+bill);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of Units");
		int Punit=s.nextInt();
		PowerBill(Punit);
	}
}
