class Animal7{
	Animal7(){
		System.out.println("Animal is created");
	}
}
class Dog7 extends Animal7
{
	Dog7()
	{
		super();
		System.out.println("dog is created");
	}
}
public class superconstructor {

	public static void main(String[] args) {
              Dog7 d=new Dog7();
             
	}

}
