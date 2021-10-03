class PatternOne
{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=0;
		for(int i=0; i<a; i++)
		{
			for (int j=0;j<=i;j++)
			{
				b++;
				if((i+j)%2==0 )
					System.out.print("1 ");
				else 
					System.out.print("0 ");
			} System.out.println("");
		}
		
	}
}
