
public class Example5 {
	public static void main(String[] args) {
		Example5 obj=new 	Example5();
		obj.start();
	}
	void start() {
		String stra="do";
		String strb=method(stra);
		System.out.println(": " + stra + strb);
	}
	String method(String stra) {
		stra=stra+ "good";
		System.out.println(stra);
		return "good";
	}

}
