public class TestMultiple extends TestClass implements I1,I2,I3 {
	public static void main(String[] args) {
		TestClass test=new TestClass();
		test.m1(); test.m2(); test.m3();
	}
}

interface I1{
	void m1();
	default void m4(){
		
	}
}
interface I2{
	void m2();
}
interface I3 extends I1,I2{
	void m3();
}

class TestClass implements I1,I2,I3{
	@Override
	public void m3() {
		System.out.println("m3() from TestClass");
	}
	@Override
	public void m2() {
		System.out.println("m2() from TestClass");
	}
	@Override
	public void m1() {
		System.out.println("m1() from TestClass");
	}
	
}