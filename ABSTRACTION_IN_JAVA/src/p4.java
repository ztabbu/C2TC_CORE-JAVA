abstract class Base{
	void fly()
	{
		System.out.println("Abstract class method");
	}
}
class Derived extends Base{
	
}



public class p4 {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.fly();

	}

}
