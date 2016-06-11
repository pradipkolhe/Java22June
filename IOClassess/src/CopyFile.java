import java.io.FileReader;
import java.io.FileWriter;
public class CopyFile {
	public static void main(String[] args) {
		try(FileReader r=new FileReader("D:\\Java22June\\Files\\FirstFile.txt");
			FileWriter w=new FileWriter("D:\\Java22June\\Files\\CopyFile.txt");
		)
		{
			int i=0;
			while((i=r.read())!=-1)
			{
				w.write(i);
			}
			w.flush();
		}
		catch(Exception e)
		{
			System.out.println("Exception Found : "+e);
		}
	}

}
