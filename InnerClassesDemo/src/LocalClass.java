
public class LocalClass {
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
	}
}
class Test{
	public void m1(){
		int i=10;
		class TestInner{
			public void m2(){
				System.out.println("m2 method from TestInner");
				System.out.println(" i : "+i);
			}
		}// TestInner class close
		TestInner in=new TestInner();
		in.m2();
	}// m1 method close
}//Test class close
