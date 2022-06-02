import java.util.Scanner;

class InvalidBloodDonateException extends Exception{
	InvalidBloodDonateException(String s){
		super(s);
	}
}
public class customException {
	static void validate(int age,int weight)throws InvalidBloodDonateException
	{
		if(age<18 && weight<55)
			throw new InvalidBloodDonateException("not eligible");
		else
			System.out.println("can donate blood");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		try {
			validate(age,weight);
		}
		catch(Exception m) {
			System.out.println("Exception occured:" +m);
		}
		System.out.println("rest of the code...");

	}

}
