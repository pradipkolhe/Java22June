
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 A a1 = new A() {
			
			@Override
			public void m1(int i) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}
		};
		
		A a = (i) -> {
			
			System.out.println("from A");
		};
		
		a.m1(12);
	}

}

@FunctionalInterface

interface A{
	
	void m1(int i);
	
	
	

}
