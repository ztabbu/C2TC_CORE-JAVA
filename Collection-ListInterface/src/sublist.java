import java.util.ArrayList;
import java.util.List;

public class sublist {

	public static void main(String[] args) {
		List<String> val=new ArrayList<String>();
		val.add("1");
		val.add("2");
		val.add("3");
		val.add("random");
		val.add("click");
		System.out.println("actual array list:" +val);
		List<String> list=val.subList(0, 4);
		System.out.println("sublist:" +list);

	}

}
