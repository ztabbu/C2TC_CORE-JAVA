abstract class Animal3{
	public abstract void sound();
}
 class Lion extends Animal3
{
	public void sound()
	{
		System.out.println("Roar");
	}
}
public class p3 {

	public static void main(String[] args) {
	Animal3 obj=new Lion();
	obj.sound();
	}

}
