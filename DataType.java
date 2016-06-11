public class DataType{
	public static void main(String a[]){
		byte b=129;
		short s=20;
		int i=122;
		long l=3332222222222222L;
		float f=12.12F;
		double d=3245.234;
		char c=-65;
		boolean flag=true;

		int x='A'; 
		System.out.println(c1); // output is 65
		char c1=(char)-20; 
		System.out.println(c1);
		byte b1=(byte)128;
		System.out.println(b1);

		int x1=10;
		System.out.println(x1);// decimal val		

		int x2=040;
		System.out.println(x2);// Octal val

		int x3=0XAB;
		System.out.println(x3);// hexa-decimal val

		int x4=0B1101;
		System.out.println(x4);// Binary val
	}
}