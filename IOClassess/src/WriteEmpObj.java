import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class WriteEmpObj {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(12);
		emp.setContact("567865785678");
		emp.setName("ABC");
		try(
				FileOutputStream out=new FileOutputStream("D:\\Java22June\\Files\\emp.ser");
				ObjectOutputStream objOut=new ObjectOutputStream(out);
		)
		{
			
			objOut.writeObject(emp);
			objOut.flush();
			out.flush();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
