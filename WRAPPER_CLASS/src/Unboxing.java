
public class Unboxing {

	public static void main(String[] args) {
		Integer a=new Integer(3);
		int i=a.intValue();
		int j=i;//unboxing
		System.out.println(a+" "+i+" "+j);

	}

}
