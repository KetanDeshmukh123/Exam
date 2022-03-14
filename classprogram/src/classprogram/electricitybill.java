package classprogram;
import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int watt,monthwatt,unit,bill;
		System.out.println("entr the no of watts per hour");
		Scanner input=new Scanner(System.in);
		watt=input.nextInt();
		
		
		monthwatt=watt*24*30;
		unit=monthwatt/1000;
		System.out.println("no of units used: "+unit);
		
		if(unit<100)
		{
		  bill=unit*7;
		  System.out.println("ur electricity bill is : "+bill);
		}
		else if(unit>100 && unit<200)
		{
			bill=unit*10;
			System.out.println("ur electricity bill is : "+bill);
		}
		else if(unit>200 )
		{
		  bill=unit*12;
		  System.out.println("ur electricity bill is : "+bill);
		}
		
		
	}
		
		
	}


