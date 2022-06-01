
public class Example2 {

	public static void main(String[] args) {
		int array[][]= {{1,2,3},{2,4,5},{4,4,5}};
		function(array);
	}
	public static void function(int array[][]) {
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(array[j][i]+ " ");
			}
			System.out.println();
		}

	}

	}


