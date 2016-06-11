public class TestClass {
	public static void main(String[] args) {
		Developer dev=new Developer();
		dev.setData();	 
	}
}
class Employee{
	private int id;
	private String name;
	private String contact;
	public int getEmpId() {
		return ++id;
	}
	public void setEmpId(int empId) {
		this.id = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >=8 && name.length() <=16 ){
			
			this.name = name;
		}
		else{
			System.err.println("Name must be 8 to 16 char");
			System.exit(0);
		}
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void displayData(){
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee contact : "+contact);
	}
}
class Developer{
	public void setData()
	{
		Employee e=new Employee();
		/*e.setEmpId(12);
		e.setName("ABCdfgdfg");
		e.setContact("567567567");*/
		e.displayData();
		
	}
}