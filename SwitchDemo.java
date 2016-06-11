public class SwitchDemo{
	public static void main(String a[]){
		int m=14;
		switch(m){
			default :
				System.out.println("Invalid Month");
				break;
			case 1 : 
				System.out.println("31 days");
				break;
			case 2 : 
				System.out.println("28 or 29 days");
				break;
			case 4 : 
				System.out.println("30 days");
				break;
		
		}

	} 
}