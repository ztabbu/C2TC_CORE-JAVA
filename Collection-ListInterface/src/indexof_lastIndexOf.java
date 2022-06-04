import java.util.ArrayList;
import java.util.List;

public class indexof_lastIndexOf {

	public static void main(String[] args) {
		List<String> val=new ArrayList<>();
		val.add("JAVA");
		val.add("C");
		val.add("C++");
		val.add("PYTHON");
		val.add("HTML");
		val.add("CSS");
		val.add("JAVASCRIPT");
		val.add("JAVA");
		System.out.println(val);
		System.out.println(val.indexOf("JAVA"));
		System.out.println(val.lastIndexOf("JAVA"));
	}

}
