
public class Pattern2 {

	public static void main(String[] args) {
		int n=3, stars;
		for(int i=0;i<3;i++)//how many stars has to be printed 
		{
			stars=n-i;
			for(int j=0;j<stars;j++)//it is going to print the expected stars in the iteration
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}


//***   //0th iteration
//**    // 1st
//*     //2nd


//   i    stars    n
//   0     3       3
//   1     2       3
//   2     1       3      stars=n-i;  3-0=3,3-1=2,3-2=1
