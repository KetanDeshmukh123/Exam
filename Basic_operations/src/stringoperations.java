
public class stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello java";
System.out.println(str);
String str1="world";
String str2=str.concat( str1);
System.out.println(str2);
System.out.println(str2.length());
String starr[]=str2.split(" ");
for(int i=0;i<starr.length;i++)
	System.out.println(starr[i]);

System.out.println(str2.toLowerCase());
System.out.println(str2.toUpperCase());
System.out.println(str2.contains("java"));
char ch=str2.charAt(2);
System.out.println(ch);
System.out.println(str.compareTo(str1));


	}

}
