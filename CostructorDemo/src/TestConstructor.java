public class TestConstructor {
	public static void main(String[] args) {
			Developer d=new Developer();
			d.setData();
	}
}
class Employee{
	int id;
	String contact;
	String name;
	public Employee() {
		System.out.println("Employee Default");
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Employee(int id, String contact, String name) {
		this(12,"ABC");
		this.contact = contact;
		this.display();
	}
	public void display(){
		System.out.println("Emp id : "+id);
		System.out.println("Emp name : "+name);
		System.out.println("Emp contact : "+contact);
	}
}
class Developer{
		public void setData(){
			//Employee e1=new Employee();/
			Employee e2=new Employee(1,"ABC");
			Employee e3=new Employee(2,"XYZ","345345354");
			//e1.display();
			e2.display();
			e3.display();
		}
}