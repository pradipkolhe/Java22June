public class AnynomousClass {
	public static void main(String[] args) {
		TestDemo demo=new TestDemo();
		demo.inter.m1();
	}
}
interface Inter1{
	public void m1();
}

class TestDemo{
	Inter1 inter=new Inter1() {
		public void m1(){
			System.out.println("m1()");
		}
	};
	
}
