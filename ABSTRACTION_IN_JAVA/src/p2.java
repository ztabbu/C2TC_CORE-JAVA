abstract class Animal2
{
	abstract void eat();
}
class Herbivores1 extends Animal2{
	void eat() {
		System.out.println("I am a vegetarian");
	}
}
class Carnivores1 extends Animal2{
	void eat() {
		System.out.println("I am non-vegetarian");
	}
}
class Omnivores1 extends Animal2{
	void eat() {
		System.out.println("I will eat both veg and non-veg ");
	}
}
public class p2 {

	public static void main(String[] args) {
		Animal2 goat =new Herbivores1();	
		Animal2 tiger =new Carnivores1();	
		Animal2 bear=new Omnivores1();	
		goat.eat();	
		tiger.eat();	
		bear.eat();	
	}

}
