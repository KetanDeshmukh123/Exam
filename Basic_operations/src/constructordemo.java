class B
{
	b()
	{
		System.out.println("i am default Constructor..");
	}
	
	B(int a)
	{
		//this();
		System.out.println("i am 1 parameter constructor...");
	}
	
	B(int a,String s)
	{
		System.out.println("i am 2 parameter constructor...");
	}
}
public class constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		B obj=new B(6,"raj");
		B obj1=new B(5);
		//B obj2=new b();
		
		
	}

}
