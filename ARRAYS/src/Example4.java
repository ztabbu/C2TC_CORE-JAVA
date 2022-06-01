import java.util.Scanner;

public class Example4 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int arr_size;
		System.out.println("enter the size of array:");
		arr_size=sc.nextInt();
		System.out.println("enter  array elements:");
		int arr[]=new int[arr_size];
		int i;
		for(i=0;i<arr_size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to search:");
		int search_elem=sc.nextInt();
		int count=0;
		for(i=0;i<arr_size;i++) {
			if(arr[i]==search_elem) {
				count++;
			}
		}
		System.out.println("count of element is:"+count);
	}

}
