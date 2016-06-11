import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TryResource {

	public static void main(String[] args) {
		
		
		try {
			FileWriter write=new FileWriter("D:\\test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Abc implements AutoCloseable{

	@Override
	public void close()  {
		// TODO Auto-generated method stub
		
	}
	
}