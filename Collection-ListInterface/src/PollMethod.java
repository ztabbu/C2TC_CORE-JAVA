import java.util.LinkedList;

public class PollMethod {

	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		list.add(4);
		list.add("Gem");
		list.add("grey");
		list.add("8");
		System.out.println("the initial list is:" +list);
		System.out.println("head of the list:" +list.poll());
		
	}

}
