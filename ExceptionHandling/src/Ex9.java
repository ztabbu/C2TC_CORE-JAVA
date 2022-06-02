
public class Ex9 {

	public static void main(String[] args) {
		String[] s= {"hello","423",null,"hi"};
		for(int i=0;i<5;i++)
		{
			try {
				int a=s[i].length()+Integer.parseInt(s[i]);
				
			}
			catch(NumberFormatException |NullPointerException|ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Handles above mention three exceptions");
			}
		}
	}
}


