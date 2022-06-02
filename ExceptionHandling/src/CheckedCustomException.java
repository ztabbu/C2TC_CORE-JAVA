import java.util.Scanner;

class NameNotFoundException extends Exception{
	NameNotFoundException(String msg){
		System.out.println(msg);
		
	}
}
public class CheckedCustomException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		try {
			customername(name);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	static void customername(String name)throws NameNotFoundException{
		if(name.isEmpty()) {
			throw new NameNotFoundException("name is empty");
		}
		else
			System.out.println("hi"+name+",welcome to our store");
	}

}
