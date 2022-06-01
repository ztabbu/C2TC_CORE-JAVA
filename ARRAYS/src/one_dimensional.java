
public class one_dimensional {

	public static void main(String[] args) {
		int [] arr= {12,4,5,2,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}

		
		
		//FOREACH LOOP
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
