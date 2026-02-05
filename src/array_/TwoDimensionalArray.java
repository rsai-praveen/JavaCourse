package array_;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] a=new int[2][3];
		int z=0;
		for (int i=0 ;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				a[i][j]=z;
				z++;
			}
			
		}
		for (int i=0 ;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+ a[i][j]+" \t");
			}
			System.out.println();
		}

	}

}
