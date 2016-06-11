import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ReadEmpObj {
	public static void main(String[] args) {
		try(
				FileInputStream in=new FileInputStream("D:\\Java22June\\Files\\emp.ser");
				ObjectInputStream objIn=new ObjectInputStream(in);
		)
		{
			Employee e=(Employee)objIn.readObject();
			System.out.println("Id : "+e.getId());
			System.out.println("Name : "+e.getName());
			System.out.println("Contact : "+e.getContact());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
