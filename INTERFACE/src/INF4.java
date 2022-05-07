interface usingstaticmethod{
	int a=10;
	static void display()
	{
		System.out.println("static method");
	}
}
public class INF4 implements usingstaticmethod  {

	public static void main(String[] args) {
		usingstaticmethod.display();
	}

}
