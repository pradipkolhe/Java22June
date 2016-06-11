
public class StringEquals {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		System.out.println(s4==s3);
		System.out.println(s1==s4);
		System.out.println("Hello"==s3);
		System.out.println(s2=="Hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println("Hello".equals(s4));
		
		String s5="HELLO";
		System.out.println(s5==s1);
		System.out.println(s5.equalsIgnoreCase(s1));
	}

}
