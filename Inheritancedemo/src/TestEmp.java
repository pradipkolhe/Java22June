
import java.lang.*;
public class TestEmp {
	public static void main(String[] args) {
		Programmer p=new Programmer(12, "ABc", "7698678", "Java Code");
		p.display();
	}
}
class Employee{
	int id;
	String name;
	String contact;
	public Employee(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
}
class Programmer extends Employee{
	String task;
	public Programmer(int id,String name,String contact,String task) {
		super(id,name,contact);
		this.task=task;
	}
	public void display(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Contact : "+contact);
		System.out.println("Task : "+this.task);
	}
}
