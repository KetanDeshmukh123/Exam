package classprogram;

import java.util.Scanner;

class calculateinvestment
{
	
        double calculateinvestment;
        calculateinvestment(double p, double r, double t)
        { 
		System.out.println("principal amount : ");
		Scanner input = new Scanner(System.in);
		p = input.nextInt();
		System.out.println("Rate : ");
		r = input.nextInt();
		System.out.println("time : ");
		t = input.nextInt();
		
		double amount=p*Math.pow((1+r/100),y);
        System.out.println("investment amount: "+amount);
        }
	}


public class futureinvestmentvalue {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       
		
		calculateinvestment m = new calculateinvestment();
		
		m.input();
		
		
		
		
		
	}

}
