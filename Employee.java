class Employee{
	int id;
	String name;
	String contact;	

	public static void main(String a[]){
		Employee emp=new Employee();
		emp.setData(12,"ABC","346436");
		Employee emp1=emp;
		emp1.displayData();
	}
	public void setData(int id,String name,String contact){
		this.id=id;
		this.name=name;
		this.contact=contact;	
	}
	public void displayData(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Contact "+contact);

	} 	
}