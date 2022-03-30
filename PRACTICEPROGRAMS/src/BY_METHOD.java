class student1{
	int roll_no;
	String name;
	void insertrecord(int  r,String n) {
		roll_no=r;
		name=n;
	}
	void displayinformation() {
		System.out.println(roll_no + "  " + name);
	}
}

public class BY_METHOD {

	public static void main(String[] args) {
		student1 s1=new student1();
		student1 s2=new student1();
		s1.insertrecord(111,"karan");
		s2.insertrecord(222,"john");
		s1.displayinformation();
		s2.displayinformation();
	}

}
