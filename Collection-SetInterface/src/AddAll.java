import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddAll {

	public static void main(String[] args) {
		Set<Integer> data=new LinkedHashSet<Integer>();
		data.add(31);
		data.add(21);
		data.add(41);
		System.out.println("set:" +data);
		ArrayList<Integer> newdata=new ArrayList<Integer>();
		newdata.add(91);
		newdata.add(71);
		newdata.add(82);
		data.addAll(newdata);
		System.out.println("set:" +data);
	}

}
