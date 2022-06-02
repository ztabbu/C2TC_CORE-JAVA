class bike{
	public void petrol() {}
}
public class finallyEx4 {

	public static void main(String[] args) {
		bike b=null;
		try {
			b.petrol();
		}
		catch(NullPointerException e)
		{
			System.out.println("this is a null pointer exception");
		}
		catch(Exception e) {
			System.out.println("this is an  Exception");
		}
		System.out.println("Everything went fine!");

	}

}
