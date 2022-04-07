package thisreference;

public class classconstructor {
	classconstructor()
	{
		System.out.println("hello a");
	}
	classconstructor(int x)
	{
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		classconstructor a=new  classconstructor(10);
	}

}
