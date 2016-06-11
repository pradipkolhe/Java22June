package Overload;
public class Test {
	public static void main(String[] args) {
		new Class1().m1(234, 12);
	}
}

class Class1{
	public void m1(Long a,Integer b){
		System.out.println("m1(Integer a,Integer b)");
	}
	public void m1(byte a,int b){
		System.out.println("m1(int a,int b)");
	}
	public void m1(long a,byte b){
		System.out.println("m1(long a,long b)");
	}
	public void m1(int... b){
		System.out.println("m1(int... b)");
	}
	/*
	public void m1(long a,long b){
		System.out.println("m1(long a,int b)");
	}*/
}