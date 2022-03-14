
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("hello java");
		String stra=new String("hello java");
		String str1="my class";
		String str2="data";
		String str3="my class";
		char ch='M';
		char ch1='m';
		System.out.println("M value"+(int)ch);
		System.out.println("m value"+(int)ch1);
		System.out.println("address str "+str.hashCode());
		System.out.println("address stra "+stra.hashCode());
		System.out.println("address str1 "+str1.hashCode());
		System.out.println("address str2 "+str2.hashCode());
		System.out.println("address str3 "+str.hashCode());

	}

}
