class Emp{
	int id;
	String name;
	float salary;
	Emp(int id,String name,float salary){
		System.out.println(id  + " " + name + " " + salary);
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class BY_ARG_CONSTRUCTOR {

	public static void main(String[] args) {
		Emp e1=new Emp(101,"ajeet",45000);
		Emp e2=new Emp(102,"irfan",40000);
		Emp e3=new Emp(1013,"ahmed",55000);
		e1.display();
		e2.display();
		e3.display();

	}

}
