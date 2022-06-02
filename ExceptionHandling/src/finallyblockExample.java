
public class finallyblockExample {

	public static void main(String[] args) {
		try
		{
			int data=30/3;
			System.out.println(data);
		}
catch(NullPointerException ex){
	System.out.println(ex);
}
		finally
		{
			System.out.println("finally block is always executed");
		}
	}

}
