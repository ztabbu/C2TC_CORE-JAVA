interface Vehicle{
	void Engine();
}
interface Bike1 extends Vehicle{
	void getMileage();
}
class R2 implements Bike1{
	public void getMileage() {
	System.out.println("Mileage is 40km/l");
	}
	public void Engine(){
		System.out.println("In Engine method");
	}
}
public class INF3 {

	public static void main(String[] args) {
		R2 bike =new R2();
		bike.getMileage();

	}

}
