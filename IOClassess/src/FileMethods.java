import java.io.File;
import java.io.IOException;


public class FileMethods {

	public static void main(String[] args) {
		File file=new File("D:\\Java22June\\Files");
		//File file1=new File("D:\\Java22June\\Files\\FirstFile.txt");
		//file.renameTo(file1);
		String filesList[]=file.list();
		for(String s : filesList){
			System.out.println(s);
		}
		//System.out.println("Folder created :"+file1.mkdir());
/*		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
*/		//System.out.println("Folder created :"+file.mkdir());

	}

}
