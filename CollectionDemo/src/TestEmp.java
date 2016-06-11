import java.util.ArrayList;
import java.util.Iterator;

public class TestEmp {
	public static void main(String[] args) {
		ArrayList<Programmer> list=new ArrayList<Programmer>();
		Programmer p1=new Programmer(12, "ABC", "657456456");
		Programmer p2=new Programmer(1, "PQR", "787686758");
		Programmer p3=new Programmer(5, "XYZ", "9789678678");
		list.add(p1);
		list.add(p2);
		list.add(p3); 
		//System.out.println(list);
		Iterator<Programmer> it=list.iterator();
		while(it.hasNext()){
			Programmer p=it.next();
			p.displayInfo();
		}
	}
}
class Programmer{
	private int id;
	private String name;
	private String contact;
	
	public Programmer(int id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	public void displayInfo(){
		System.out.println("Programmer id : "+id);
		System.out.println("Programmer Name : "+name);
		System.out.println("Programmer Contact : "+contact);
	}
}