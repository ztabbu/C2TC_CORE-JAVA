interface Bike
{
	void getMilage();
}
class R1 implements Bike
{
	public void getMilage()
	{
		System.out.println("Milage is 40 Km/l");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
        //Bike bike=new Bike();  because Bike is an abstract type we cannot instantiate it
		R1 bike=new R1();
		//Bike bike1=new R1();    we can have the interface as a reference(Bike)  but can't create its object
         bike.getMilage();

	}

}
