abstract class Animal
{
	abstract void eat();
}
class Herbivores extends Animal{
	void eat() {
		System.out.println("I am a vegetarian");
	}
}
class Carnivores extends Animal{
	void eat() {
		System.out.println("I am non-vegetarian");
	}
}
public class P1 {

	public static void main(String[] args) {
		Carnivores goat =new Carnivores();	
		goat.eat();
	}

}
