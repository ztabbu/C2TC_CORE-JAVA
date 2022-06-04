import java.util.ArrayList;
import java.util.List;

public class removeAll {

	public static void main(String[] args) {
		List<Integer> val=new ArrayList<>();
		val.add(0);
		val.add(11);
		val.add(22);
		List<Integer> val2=new ArrayList<>();
		val2.add(22);
		val2.add(100);
		System.out.println(val);
		System.out.println(val2);
		val.removeAll(val2);
		System.out.println(val);

	}

}
