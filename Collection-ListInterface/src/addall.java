import java.util.ArrayList;
import java.util.List;

public class addall {

	public static void main(String[] args) {
		List<String> val=new ArrayList<>();
		val.add("corona can be stopped");
		
	List<String> val1=new ArrayList<>();
	val1.add("stay at home");
	val.addAll(val1);
	System.out.println(val);

}
}
