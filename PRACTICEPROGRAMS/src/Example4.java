class Demo{
	int x;
}


public class Example4 {
	public static void main(String[] args) {
		Demo myobj=new	Demo();
		myobj.x=40;
		System.out.println(myobj.x);
		System.out.println("\n");

		
		System.out.println("PRINTING TWO VLUES OF X");
		Demo myobj1=new Demo();
		Demo myobj2=new Demo();
		myobj1.x=24;
		myobj2.x=55;
		System.out.println(myobj1.x);
		System.out.println(myobj2.x);
	}

}
