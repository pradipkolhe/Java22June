import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class BufferReadWrite {

	public static void main(String[] args) {
		try(
				FileInputStream in=new FileInputStream("C:\\Users\\Public\\Videos\\Sample Videos\\Wildlife.wmv");
				BufferedInputStream brIn=new BufferedInputStream(in);
				FileOutputStream out=new FileOutputStream("D:\\Java22June\\Files\\bufferTest.wmv");
				BufferedOutputStream brOut=new BufferedOutputStream(out);
			)
		{
			int i=0;
			while((i=brIn.read())!=-1){
				brOut.write(i);
			}
			brOut.flush();
			out.flush();
		}
		catch(Exception e)
		{
			System.out.println("Exception found : "+e);
		}
	}

}
