
public class TestThread {

	public static void main(String[] args) {
		Test t=new Test();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of Table print");
	}

}

class Test extends Thread{
	public void run() {
		System.out.println(currentThread());
		for(int i=0;i<=10;i++){
			System.out.println(" 5 * "+i+" = "+(5*i));
		}
	}
}
