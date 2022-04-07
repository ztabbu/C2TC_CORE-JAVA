package thisreference;
class s2{
	void m(s2 a)
	{
		System.out.println("method is invoked");
	}
	void p()
	{
		m(this);
	}
}
public class methodcall {

	public static void main(String[] args) {
		s2 s=new s2();
		s.p();

	}

}
