package programming;
import java.util.Scanner;
public class ElectricityBill {
	
		public static void getunit()
		{
			float bill=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Units");
			int unit=s.nextInt();
			if(unit<200)
			{
				bill=unit*1.2f;
			}
			else if(unit>=200 && unit<400)
			{
				bill=(unit-199)*1.5f+199*1.2f;
			}
			else if(unit>=400 && unit<600)
			{
				bill=(unit-399)*1.8f+(unit-199)*1.5f+199*1.2f;
			}
			else 
			{
				bill=(unit-599)*2+(unit-399)*1.8f+(unit-199)*1.5f+199*1.2f;
			}
			System.out.println("The bill:"+bill);
			s.close();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getunit();
	}

	}
