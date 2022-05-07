interface interface1
{
	public void myMethod();
}
interface interface2
{
	public void myMethod();
}
class M1 implements interface1,interface2
{
	public void myMethod() {
		System.out.println("Implementing more than one interfaces");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		M1 obj=new M1();
		obj.myMethod();

	}

}
