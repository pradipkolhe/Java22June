public class TestStatic {
	public final static void main(String... args) {
		TestCount t1=new TestCount();
		t1.dipalyCount();
		TestCount t2=new TestCount();
		t2.dipalyCount();
		t2.count++;
		TestCount t3=new TestCount();
		t3.dipalyCount();
		TestCount t4=new TestCount();
		t4.dipalyCount();
		t1.dipalyCount();
	}
	
}
class TestCount{
	static int count =0;
	public TestCount() {
		count++;
	}
	public void dipalyCount(){
		System.out.println("Totoal count of Object : "+count);
	}
	static void m1(){
		System.out.println("Static method");
	}
}