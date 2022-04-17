abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run() {
		System.out.println("running safely..");
	}
}
class Abstractclass{
	public static void main(String args[]) {
		Honda h=new Honda();
		h.run();
	}
}