class Student{
	int id;
	String name;
}

public class BY_REFERENCE {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=101;
		s1.name="john";
		System.out.println(s1.id + "   " + s1.name);

	}

}
