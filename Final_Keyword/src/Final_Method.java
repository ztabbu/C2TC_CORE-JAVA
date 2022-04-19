public class Final_Method {
final void run()
{
	System.out.println("running");
}
}
class test extends Final_Method{
	int run1() {
		return 4;
		
	}

	public static void main(String[] args) {
		test t=new test();
		t.run1();
	}

}
