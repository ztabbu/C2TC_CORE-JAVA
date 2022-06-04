import java.util.SortedSet;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		SortedSet<String> obj=new TreeSet<>();
		obj.add("Technology");
		obj.add("Technical");
		obj.add("code");
		obj.add("quiz");
		System.out.println("first:" +obj.first());
		System.out.println("last:" +obj.last());
	}

}
