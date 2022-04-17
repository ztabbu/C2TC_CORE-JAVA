abstract class Bike1{
	 Bike1(){
		System.out.println("Bike is created");
	}

abstract void run();
void ChangeGear() {
	System.out.println("gear changed");
}
}
class Honda1 extends Bike1{
	void run() {
		System.out.println("running safely");
	}
}
public class AbstractConstructor {

	public static void main(String[] args) {
		Honda1 h=new Honda1();
		h.run();
		h.ChangeGear();

	}

}
