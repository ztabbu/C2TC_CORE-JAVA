import java.util.Scanner;

public class Example3 {

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
		int is_matched=0;
		for(i=0;i<arr_size;i++) {
			if(arr[i]==search_elem) {
				is_matched=1;
				break;
			}
		}
		if(is_matched==1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		}

}
