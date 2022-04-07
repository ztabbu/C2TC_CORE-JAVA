package statickeyword;

public class Student1 {
	int rollno=1;
	String name;
	static String college="KBN";
	Student1(int r,String n){
		rollno=r;
		name=n;
	}
	
	static void change() {
		college="PDA";
	}
	void display() {
		System.out.println(rollno+ " "+name+" "+college);
	}

	public static void main(String[] args) {
		Student1 s1=new Student1(111,"karan");
		Student1 s2=new Student1(222,"john");
		Student1.change();
		s1.display();
		s2.display();
		

	}

}
