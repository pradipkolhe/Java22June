import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ByteFileCopy {

	public static void main(String[] args) {
		try(
			FileInputStream in=new FileInputStream("C:\\Users\\Public\\Videos\\Sample Videos\\Wildlife.wmv");
			FileOutputStream out=new FileOutputStream("D:\\Java22June\\Files\\test.mp4");
			)
		{
			int data=0;
			while((data=in.read())!=-1){
				out.write(data);
			}
			out.flush();
		}
		catch(Exception e){
			System.out.println("Exception found : "+e);
		}

	}

}
