import java.util.SortedSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		SortedSet<String> obj=new TreeSet<>();
		obj.add("Technology");
		obj.add("Technical");
		obj.add("code");
		obj.add("quiz");
		System.out.println(obj);
		SortedSet<String> beforeQuiz=obj.headSet("quiz");
		SortedSet<String> afterQuiz=obj.tailSet("quiz");
		System.out.println(beforeQuiz);
		System.out.println(afterQuiz);
		System.out.println(obj);

	}

}
