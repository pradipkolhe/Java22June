public class CustomException {
	public static void main(String[] args) {
			new Employee().setName("abc");
			
	}
}

class Employee{
	private String name;
	@Override
	protected void finalize() throws Throwable {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>=8 && name.length()<=16){
			this.name = name;
			System.out.println("Name: "+name);
		}
		else{
			try {
				throw new Validate();
			} catch (Validate e) {
				e.displayError();
			}
		}		
	}		
}
class Validate extends Exception{
	public void displayError(){
		System.err.println("Name must contain 8 to 16 char");
	}
}