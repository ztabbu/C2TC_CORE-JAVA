import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {

	public static void main(String[] args) {
		List<Integer> val=new ArrayList<>();
		val.add(100);
		val.add(11);
		val.add(55);
		val.add(34);
		System.out.println("original list:" +val);
		Collections.sort(val);
		System.out.println("sorted list:" +val);
	}

}
