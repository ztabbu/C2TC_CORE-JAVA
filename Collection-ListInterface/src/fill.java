import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fill {

	public static void main(String[] args) {
		List<String> val=new ArrayList<>();
		val.add("c");
		val.add("python");
		val.add(".net");
		System.out.println("list elements before replacement:" +val);
		Collections.fill(val, "java");
		System.out.println("list elements after replacements:" +val);
	}

}
