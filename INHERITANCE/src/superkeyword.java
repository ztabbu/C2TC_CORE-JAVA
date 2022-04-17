class Animal5{
	String color="white";
	
}
class Dog5 extends Animal5{
	String color="black";
	void printcolor() {
		System.out.println(color);//print color of Dog5 class
		System.out.println(super.color);//print color of Animal5 class
	}
}
public class superkeyword {

	public static void main(String[] args) {
		Dog5  d=new Dog5();
		d.printcolor();

	}

}
