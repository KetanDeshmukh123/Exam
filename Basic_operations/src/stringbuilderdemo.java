
public class stringbuilderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sbl=new StringBuilder("hi  ");
		sbl.append("friends for java");
		System.out.println(sbl);
		System.out.println(sbl.charAt(2));
		System.out.println(sbl.length());
		int cap=sbl.capacity();
		System.out.println(cap);
		System.out.println(sbl.substring(5,7));
		sbl.trimToSize();
		System.out.println(sbl);
	}

}
