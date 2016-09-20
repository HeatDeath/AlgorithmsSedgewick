public class Migrate{
	public Migrate(){
		
	}
	public static void main(String[] args){
		int m=5;
		int n=5;
		int[][] a=new int [m][n];
		int[][] b=new int [n][m];
		a=Randominitial(a,n);
		b=MigrateArrays(a,b);
		MigratePrint(b);
	}
	public static void MigratePrint(int[][] a)
	{
		StdOut.println("输出转置二维数组:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				StdOut.print(a[i][j]+" ");
			}
			StdOut.println();
		}
	}
	public static int[][] MigrateArrays(int[][] a,int [][]b)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		return b;
	}
	public static int[][] RandomInitial(int[][] a,int N)
	{
		StdOut.printlin("初始化二维数组:");
		for(int i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				a[i][j]=StdRandom.uniform(N);
				StdOut.print(a[i][j]+" ");
			}
			StdOut.println();
		}
	}
}