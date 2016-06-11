package Overload;
public class TestOverload {
	public static void main(String... args) {
		Cal c=new  Cal();
		c.add(12,3245,456,5476,56);
	}
}

class Cal{
	public void add(int a,int b){
		System.out.println("Add 2 number : "+(a+b));
	}
	
	public void add(int a,int... b){
		int temp=0;
		for( int x : b){
			temp=temp+x;
		}
		System.out.println("Add 3 numbers : "+(a+temp));
	}
}
