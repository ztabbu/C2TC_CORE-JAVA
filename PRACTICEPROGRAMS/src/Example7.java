public class Example7 {
 String name;
 
	public static void main(String[] args) {
		Example7 e1=new Example7();
        Example7 e=e1;
        e1.name="C2TC";
        e=null;
        System.out.println(e.name);
	}

}
