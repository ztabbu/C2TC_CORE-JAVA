
public class Ex2 {

	public static void main(String[] args) {
		System.out.println("first line");
		System.out.println("second line");
		try
		{
			int[] myarray=new int[] {1,2,3};
			print(myarray);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the array does not have fourth element!");
		}
		System.out.println("third line");

	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
	}

}
