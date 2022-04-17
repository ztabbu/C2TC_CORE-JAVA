class Animal2{
	void eat()
	{
		System.out.println("eating....");
	}
}
class d2 extends Animal2{
	void bark()
	{
		System.out.println("barking....");
	}
}
class cat extends Animal2{
	void meow()
	{
		System.out.println("meowing....");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		cat c=new cat();
		c.meow();
		c.eat();	
	}

}
