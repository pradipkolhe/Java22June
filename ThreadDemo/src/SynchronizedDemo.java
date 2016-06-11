public class SynchronizedDemo {
	public static void main(String[] args) {
		TablePrint table=new TablePrint();
		ThreadTest t1=new ThreadTest(table, 5);
		ThreadTest t2=new ThreadTest(table, 15);
		ThreadTest t3=new ThreadTest(table, 50);
		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadTest extends Thread{
	TablePrint print;
	int num;
	public ThreadTest(TablePrint print,int num) {
		this.print=print;
		this.num=num;
	}
	@Override
	public void run() {
		synchronized (print) {
			print.n=num;
			print.displayTable();
		}
	}
}
class TablePrint{
	int n;
	public void displayTable(){
		for(int i=0;i<=10;i++){
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}