
public class FormatExample {

	public static void main(String[] args) {
		String name="CSK";
		String s1=String.format("%s", name);
		String s2=String.format("%f", 32.33434);
		String s3=String.format("%16.12f",32.33434);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
