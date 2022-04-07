package thisreference;
class test{
	int rollno;
	String name;
	float fee;
	 test(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno+ " "+name+" "+fee);
	}
	
}
public class instancevar {

	public static void main(String[] args) {
	test t1=new test(111,"ahmed",5000f);
	test t2=new test(222,"afreen",4000f);
	t1.display();
	t2.display();
	}

}
