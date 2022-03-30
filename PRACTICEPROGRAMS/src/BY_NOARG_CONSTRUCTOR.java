class Employee{
	int id;
	String name;
	float salary;
	Employee(){
		System.out.println("user_defined no argument " + "constructor executed");
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class BY_NOARG_CONSTRUCTOR {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.display();
		e2.display();
	}

}
