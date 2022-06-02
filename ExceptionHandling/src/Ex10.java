
public class Ex10 {

	public static void main(String[] args) {
		try
		{
			int i=Integer.parseInt("thor");
		}
		catch(Exception ex)
		{
			System.out.println("this block handles all exception types");
		}
		//catch(NumberFormatException ex)unreachable catch block already handled by above catch block exception
		//{
//			System.out.println("this block handles numberformatexception");
		//}

	}

}
