import java.util.ArrayList;
import java.util.List;

public class clone {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		Object clonelist;
		al.add("JAVA");
		al.add("C");
		al.add("C++");
		al.add("PYTHON");
		System.out.println(al);
		clonelist=al.clone();
		System.out.println(clonelist);
	}

}
