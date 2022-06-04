import java.util.ArrayList;
import java.util.List;

public class isEmpty {

	public static void main(String[] args) {
		List<String> val=new ArrayList<>();
		val.add("JAVA");
		val.add("C");
		val.add("C++");
		val.add("PYTHON");
		val.add("HTML");
		System.out.println(val);
		System.out.println(val.get(1));
		System.out.println(val.contains("C++"));
		val.add(3, "CSS");
		System.out.println(val);
		System.out.println(val.isEmpty());
		System.out.println(val.indexOf("C++"));
		System.out.println(val.size());
	}

}
