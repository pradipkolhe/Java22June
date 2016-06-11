public class IfDemo{
	public static void main(String a[]){
		int marks=65;
		boolean b=false;
		if(marks >= 40 && marks <= 100){
			System.out.println("Congrates");
			if(marks >= 60 & marks < 65)
				System.out.println("1st class");
			else if(marks >= 50 & marks < 60)
				System.out.println("2nd class");
			else if(marks >= 65)
				System.out.println("dist");
			else
				System.out.println("Pass");
		}		
		else if(marks < 40 && marks >= 0){
			System.out.println("Fail");
		}
		else{
			System.out.println("Invalid marks");
		}
		System.out.println("End");
	}
}