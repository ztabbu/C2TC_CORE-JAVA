class main{
	public static void printing_2D(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.println(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
public class Two_D_Ex {

	public static void main(String[] args) {
		int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		main.printing_2D(mat);

	}

}
