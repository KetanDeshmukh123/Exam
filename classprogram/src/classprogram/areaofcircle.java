package classprogram;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int rad;
		double area;
		double pi=3.14;
		System.out.println("enter radius of circle");
		Scanner input= new Scanner(System.in);
		rad=input.nextInt();
		
		area=pi*rad*rad;
		
		System.out.println("area of circle="+area);

	}

}
