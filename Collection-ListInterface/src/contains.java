import java.util.ArrayList;
import java.util.List;

public class contains {

	public static void main(String[] args) {
		List<String> val=new ArrayList<>();
		val.add("pen");
		val.add("pencil");
		val.add("eraser");
		System.out.println("list" +val);
		boolean res=val.contains("pencil");
		System.out.println("is pencil present in the list:" +res);

	}

}
