class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c)//another way:static double add(double a,double b) .....same 
	//name &no of parameters but different data type
	//static double add(int a,int b)  overloading cannot be achieved by changing only return type of method
	{
		return a+b;
	}
}
public class Ex1 {

	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		//System.out.println(Adder.add(11, 11, 11));
	}

}
