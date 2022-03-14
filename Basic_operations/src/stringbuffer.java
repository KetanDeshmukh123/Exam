
public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("welcome");
		System.out.println(sb);
		sb.append(" To java ");
		System.out.println(sb);
		sb.insert(11, "hi");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		
	}

}
