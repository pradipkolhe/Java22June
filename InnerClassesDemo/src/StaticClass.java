public class StaticClass {
	public static void main(String[] args) {
		Outer.Inner in=new Outer.Inner();
		in.m2();
	}
}

class Outer{
	private static int i=10;
	private static void m1(){
		System.out.println("private m1 from class Outer");
	}
	private void m3(){
		System.out.println("private m3 from Outer class");
	}
	static class Inner{
		public void m2(){
			System.out.println("i : "+i);
			m1();
			Outer out=new Outer();
			out.m3();
		}
	}
}
