public class SingleDemo {
	public static void main(String[] args) {
		C c=new  C();
		
	}
}

class A{   // Super class
	int i=120;
	void m1(){
		System.out.println("class A m1()");
	}
	public A() {
		System.out.println("A Default");
	}
}
class B extends A{  // Sub class
	int i=12;
	public B() {
		super();
		System.out.println("B default ");
		System.out.println(super.i);
		super.m1();
	}
	public void m1(){
		
	}
}
class C extends B{
	public C() {
		
		System.out.println("C default ");
	}
}