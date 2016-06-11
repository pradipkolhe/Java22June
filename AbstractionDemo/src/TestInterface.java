public class TestInterface {
	public static void main(String[] args) {
		//Inter i=new InterfaceTesting();
		//i.m1();
		InterfaceTesting test=new InterfaceTesting();
		test.m1();
	}
}
interface Inter{
	int i=90;
	void m1();
}
class InterfaceTesting implements Inter{
	@Override
	public void m1() {
		//i=i+11;
		System.out.println(i+11);
		System.out.println("InterfaceTesting class and m1()");
	}
	
}