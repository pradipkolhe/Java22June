import java.io.FileWriter;
import java.sql.SQLException;


public class ThrowsExe {

	public static void main(String[] args) {
		new ThrowsExe().m1();
	}
	public void m1(){
		m2();
	}
	public void m2(){
		try{
		m3();
		}
		catch(Exception e){
			System.out.println("in m2 catch");
		}
	}
	public void m3() throws Exception{
		int i=10/0;
		FileWriter writer=new FileWriter("");
		throw new SQLException();
	}
}
