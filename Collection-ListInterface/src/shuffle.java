import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffle {

	public static void main(String[] args) {
		List<String> val=new ArrayList<>();
		val.add("c");
		val.add("python");
		val.add(".net");
		val.add("java");
		Collections.shuffle(val);
		System.out.println("results after shuffle operation:" +val);
		Collections.shuffle(val);
		
	}

}
