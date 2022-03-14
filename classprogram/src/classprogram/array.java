package classprogram;

import java.util.Scanner;

class writearray
{
	public writearray()
	{
		int i,j;
		int arr[][]=new int[3][3];
		
		System.out.println("enter the elements of array");
		Scanner input=new Scanner(System.in);
		for(i=0;i<=3;i++)
		{
			for(j=0;j<=3;j++)
			{
				System.out.println(arr[i][j]);
				arr[3][3]=input.nextInt();
				
			}                                                                                                 
		}
	}

	public void writearray() {
		// TODO Auto-generated method stub
		
	}
}

	

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		writearray array= new writearray();
		array.writearray();	
	}
}



