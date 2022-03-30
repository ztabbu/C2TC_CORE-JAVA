
public class Example9 {
	String name;
	public static void main(String[] args) {
		Example9 e1=new Example9();
		e1.name="C2TC";
		Example9 e2=e1;
		e1=null;
		System.out.println(e2.name);
		new  Example9();
		 Example9 e3 = null;
		 e3.name="C2TC";
		System.out.println(e3.name);

	}

}
