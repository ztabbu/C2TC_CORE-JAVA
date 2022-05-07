class Bank{
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 9;
	}
}
class AXIS extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
public class Test {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println("SBI rate of interest is:" +s.getRateOfInterest());
		System.out.println("ICICI rate of interest is:" +i.getRateOfInterest());
		System.out.println("AXIS rate of interest is:" +a.getRateOfInterest());

	}

}
