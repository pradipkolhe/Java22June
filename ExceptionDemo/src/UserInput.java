import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try{	
			System.out.println("Enter 1st No :  ");
			int i=scan.nextInt();
			System.out.println("Enter 2nd No :  ");
			int j=scan.nextInt();
			System.out.println("Addition :  "+(i+j));
			///scan.close();
		}
		
		catch(Exception e){
			System.err.println("Enter number onlyd......");
			//scan.close();
		}
		finally{
			System.out.println("finally block");
			scan.close();
		}
		System.out.println("End ");
		
	}

}
