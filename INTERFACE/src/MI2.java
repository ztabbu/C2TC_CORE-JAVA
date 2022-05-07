interface Writable{
	void writes();
}
interface Readable{
	void reads();
}
class Student implements Writable,Readable
{
	public void writes() {
		System.out.println("student writes...");
	}
	public void reads() {
		System.out.println("student reads...");
	}
}
public class MI2 {

	public static void main(String[] args) {
	Student s=new Student();
	s.writes();
	s.reads();
	}

}
