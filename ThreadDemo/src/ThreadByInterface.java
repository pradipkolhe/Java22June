public class ThreadByInterface {
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		Thread t1=new Thread(myThread);
		t1.setName("my Thread");
		t1.start();
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}
	}
}

class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++){
			System.out.println(" 5 * "+i+" = "+(5*i));
		}	
	}
}
