 import static java.lang.Math.*;
abstract public class TestAbstraction {
	public static void main(String[] args) {
		Bank b=new SBI();
		b.interestRate();
		//b.m1();
	}

}

abstract class Bank{
	int x=10;
	public Bank() {
		System.out.println("abstract Bank class Default ");
	}
	abstract public void interestRate();
	//abstract public void ATM();
}

class SBI extends Bank{
	
	public void interestRate() {
		System.out.println(PI);
		System.out.println("10 % Rate");
	}
}
