import java.io.Console;


public class UsingConsole {

	public static void main(String[] args) 
	{
		Console c = System.console();
		System.out.println("Enter a string : ");
		String s = c.readLine();
		System.out.println("You entered : "+s);
		
	}

}