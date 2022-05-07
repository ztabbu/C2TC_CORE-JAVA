interface Inf1
{
	public void method();
}
public class INF implements Inf1 {
	public void method()
	{
		System.out.println("Method");
	}

	public static void main(String[] args) {
		
		INF obj=new INF();
		obj.method();
	}

}
