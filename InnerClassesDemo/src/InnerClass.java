public class InnerClass {
	public static void main(String[] args) {
		SimpleOuter out=new SimpleOuter();
		SimpleOuter.SimpleInner in=new SimpleOuter().new SimpleInner();
		in.m2();
	}
}

class SimpleOuter{
	private int i=10;
	private void m1(){
		System.out.println("private Method m1 form SimpleOuter");
	}
	
	class SimpleInner{
		public void m2(){
			System.out.println("i : "+i);
			m1();
		}
	}//close inner class
}	//close Outer class
