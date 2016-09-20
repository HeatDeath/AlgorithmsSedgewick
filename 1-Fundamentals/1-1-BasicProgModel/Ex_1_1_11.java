public class test{
	public Test{
		
	}
	public static void main(String[] args){
		boolean[][] a=new boolean[10][10];
		a=RandomInitial(a);
		TeatPrint(a);		
	}
	public static void TestPrint(boolean[][] a){
		StdOut.print(" "+i);
		StdOut.println(" ");
		for(int i=0;i<10;i++)
		{
			Stdout.print(i);
			for(int j=0;j<10;j++)
			{
				if(a[i][j])
					StdOut.print("*"+ " ");
				else
					StdOut.print(" "+" ");				
			}
			StdOut.println(" ");
		}
	}
	public static boolean[][] Randominitial(boolean[][] a){
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(StdRandom.bernoulli(0.1))
					a[i][j]=true;
				else
					a[i][j]=false;
			}
		}
		return a;
	}
}