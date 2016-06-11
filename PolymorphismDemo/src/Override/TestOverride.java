package Override;
public class TestOverride {
	public static void main(String[] args) {
		/*Bank b=new Bank();
		SBI sbi=new  SBI();
		ICICI icici=new ICICI();
		b.getInterestRate();
		sbi.getInterestRate();
		icici.getInterestRate();*/
		Bank s1=new SBI();
		s1.getInterestRate();
	}
}

class Bank{
	public float getInterestRate(){
		System.out.println("Bank Rate : "+9);
		return 9;
	}
}
class SBI extends Bank{
	@Override
	public float getInterestRate() {
		System.out.println("SBI rate : "+9.5);
		return 9.5f;
	}
}
class ICICI extends Bank{
	@Override
	public float getInterestRate() {
		System.out.println("ICICI rate : "+10);
		return 10;
	}
}
