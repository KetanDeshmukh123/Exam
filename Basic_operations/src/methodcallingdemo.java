class A
{
	int a=10,b=20;
	public void m1()
	{
		System.out.println("m1 void method");
	}
	
	public int m2()
	{
		System.out.println("m2 method returns int number...");
	}
	
	public float m3()
	{
		System.out.println("m3 method returns float number...");
	}
	
	public boolean m4()
	{
		sysout("m4 method returns float number...");
		if(a>b)
			return true;
		else
			return false;
	}
	
	public A m5()
	{
		System.out.println("m5 method returns class A object...");
		A oa = new A();
		return oa;
	}
	
	public void inM1(int id, String name)
	{
		System.out.println("id:" +id);
		System.out.println("name:"+name);
	}
	
	public boolean inM2(int id,float marks)
	{
		System.out.println("id:"+id);
		System.out.println("marks:"+marks);
		if(marks>35)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Employee inM3(int id)
	{
		Employee emp=new Employee();
		emp.setEmpid(101);
		emp.setEmpName("");
		emp.setSal(2182.90);
		
		return emp;
	}
	
	public Employee inM4(Company company)
	{
		Employee emp=new Employee(101,"raj",8990.90);
		System.out.println(company);
		
		return emp;
	}
	
}
public class methodcallingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A oa=new A();
		oa.m1();
		
		int result =oa.m2();
		System.out.println(result);
		
		float sum=oa.m3();
		System.out.println(sum);
		
		boolean status=oa.m4();
		System.out.println(status);
		
		A obj=oa.m5();
		System.out.println(obj);
		
		oa.inM1(101,"raj");
		
		boolean res=oa.inM2(101, 90.0f);
		System.out.println(res);
		Employee emp=new Employee();
		//emp=oa.inM3(101);
		//System.out.println(emp);
		Employee empobj=new Employee();
		empObj=oa.inM4(new Company("infosys","pune"));
		System.out.println(empObj);

	}

}
