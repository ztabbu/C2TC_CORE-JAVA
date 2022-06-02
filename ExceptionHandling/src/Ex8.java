
public class Ex8 {

	public static void main(String[] args) {
		String[] s= {"hello","423",null,"hi"};
		for(int i=0;i<5;i++)
		{
			try {
				int a=s[i].length()+Integer.parseInt(s[i]);
				System.out.println(a);
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Number Format Exception");
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("ArrayIndeexOutOfBoundsException");
			}
			catch(NullPointerException ex)
			{
				System.out.println("NullPointerException");
			}
			System.out.println("continuing...");
		}
	}

	}

