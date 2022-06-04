import java.util.ArrayList;
import java.util.List;

public class SetMethod {

	public static void main(String[] args) {
		List<Integer> val=new ArrayList<>();
		val.add(33);
		val.add(11);
		val.add(23);
		val.add(34);
		System.out.println(val);
		val.set(1,000);
		val.set(3,000);
		System.out.println(val);
	}

}
