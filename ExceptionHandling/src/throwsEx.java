import java.io.IOException;

class Myclass1{
	void myclass(int num)throws Exception{
		if(num==1)
			throw new IOException("IOException occured");
		else
			throw new ClassNotFoundException("class not found exception");
	}
}
public class throwsEx {

	public static void main(String[] args) {
		try {
			Myclass1 ob=new Myclass1();
			ob.myclass(1);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
