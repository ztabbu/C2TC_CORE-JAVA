
public class Ex4 {

	public static void main(String[] args) {
		Ex4 e1=new Ex4();
		try
		{
			e1.meth1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException thrown by meth1 method is caught in main method");
		}
	}
	public void meth1()
	{
		try
		{
			System.out.println(100/0);
		}
		catch(Exception nullExp)
		{
			System.out.println("we have an Exception"+nullExp);
		}
		System.out.println("outside try-catch block");
	}

	}


