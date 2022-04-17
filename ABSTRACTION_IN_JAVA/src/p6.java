 abstract class dress
{
	abstract void type();
}
class menswear extends dress
{
	void type() {
		System.out.println("Its a Men's  Wear");
	}
}
public class p6 {

	public static void main(String[] args) {
		menswear coat=new menswear();
		coat.type();
	}

}
