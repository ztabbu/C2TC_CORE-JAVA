public class throwEx3{

	public static void main(String[] args) {
		try {
			validate(21);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");

}

	private static void validate(int age) {
		if(age<21||age>27)
			throw new ArithmeticException("not eligible");
			else
				System.out.println("eligible to attend military selection");
	}

	}
