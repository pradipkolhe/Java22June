
public class DefaultThread {

	public static void main(String[] args) {
		PrintTable t=new PrintTable();
		t.setName("Table Print");
		t.setPriority(10);
		t.start();
		/*try {
			t.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}
	}
}

class PrintTable extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for(int i=0;i<=10;i++){
			System.out.println(" 5 * "+i+" = "+(5*i));
		}	 
	}
}