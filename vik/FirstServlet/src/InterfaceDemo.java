
public class InterfaceDemo {

	public static void main(String[] args) {
		
		
		A a = (i)->{
			
			System.out.println("from A");
		};

		  a.m1(20);
	}

}
@FunctionalInterface

interface A{
	
	void m1(int i);
	
}

interface B{
	
	default void m1(){
		
		System.out.println("from m1");
	}
}
