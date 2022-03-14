class Sample{
	int a=10;
	static int b=20;
	void m1() {
		float f=10.8f;
		System.out.println(f);
	}
	void m2() {
		System.out.println(a);
		System.out.println(b);
		
	}
	static void m3() {
		//System.out.println(a);
		System.out.println(b);
	}
}
public class variabledemo {
      	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
       //  Sample.b=90;
         Sample sample=new Sample();
         
         sample.m1();
         sample.m2();
         Sample.b=90;
         sample.m3();
	}

}
