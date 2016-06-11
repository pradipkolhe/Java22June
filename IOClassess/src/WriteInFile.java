import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WriteInFile {

	public static void main(String[] args) {
		
   try (Scanner scan=new  Scanner(System.in);
	FileWriter wr=new FileWriter("D:\\Java22June\\Files\\FirstFile.txt",true);){
			
			System.out.println("Enter Message : ");
			String msg=scan.nextLine();
			wr.write("\n"+msg+"\n");
			wr.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
