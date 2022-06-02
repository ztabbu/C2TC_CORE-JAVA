
public class finallyEx3 {

	public static void main(String[] args) {
		try
		{
			int i;
			return;
		}
		catch(Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
	}

}
