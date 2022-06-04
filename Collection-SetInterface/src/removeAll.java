import java.util.LinkedHashSet;

public class removeAll {

	public static void main(String[] args) {
		LinkedHashSet<Integer> list1=new LinkedHashSet<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		System.out.println("data: " +list1);
		LinkedHashSet<Integer> list2=new LinkedHashSet<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println("newdata:" +list2);
		list1.removeAll(list2);
		System.out.println(list1);

	}

}
