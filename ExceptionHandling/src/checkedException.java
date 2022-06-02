import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class checkedException {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis=null;
		fis=new FileInputStream("D:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}

}
