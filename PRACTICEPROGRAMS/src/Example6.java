class Apple{
	int weight;
}


public class Example6 {

	public static void main(String[] args) {
		Apple a1=new Apple();
		Apple a2=new Apple();
		a1.weight=1;
		a2.weight=2;
		a2=a1; //a2 will point where ever a1 is pointing
		System.out.println(a2.weight);

	}

}
