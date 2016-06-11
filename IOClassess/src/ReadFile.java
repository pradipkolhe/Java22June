import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadFile {

	public static void main(String[] args) {
		try {
			FileReader read=new FileReader("D:\\Java22June\\Files\\FirstFile.txt");
			int i=0;
			while((i=read.read())!=-1){
				System.out.print((char)i);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
