public static int lga(int N,int M)
{
	int a=0;
	while(N>=M)
	{
		N=N/M;
		a++;
	}
	return a;
}