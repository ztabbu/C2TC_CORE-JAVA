import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class ListTooLargeException extends RuntimeException{
	ListTooLargeException(String msg){
		System.out.println(msg);
	}
}
class myclass{
	public void analyze(List<String>data) {
		if(data.size()>50) {
			throw new ListTooLargeException("list cannot exceed 50 items!");
		}
	}
}
public class UncheckedCustomException {

	public static void main(String[] args) {
		myclass ob=new myclass();
		List<String> data=new ArrayList<>(Collections.nCopies(100, "customer details"));
		ob.analyze(data);
	}

}
