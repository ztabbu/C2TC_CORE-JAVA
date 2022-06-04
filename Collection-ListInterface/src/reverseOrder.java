import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseOrder {

	public static void main(String[] args) {
		List<Integer> val=new ArrayList<>();
		val.add(100);
		val.add(11);
		val.add(55);
		val.add(34);
		System.out.println("original list:" +val);
		Collections.sort(val, Collections.reverseOrder());//list will be sorted in descending order
		System.out.println("reverse list:" +val);

	}

}
