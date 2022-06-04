import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rotate {

	public static void main(String[] args) {
		List<String> val=new ArrayList<>();
		val.add("practice");
		val.add("code");
		val.add("every");
		val.add("day");
		System.out.println("original list:" +val);
		Collections.rotate(val, 2);
		System.out.println("rotated list:" +val);
		

	}

}
