class Main
{
	public static void main(String[] args)
	{
		int n=5,r=3,x=n-r,i=1,fact1=1,fact2=1,fact3=1;
		while(i<=n)
		{
			fact1=fact1*i;
			i++;
		}
		System.out.println(n+" factorial is "+fact1);	
		i=1;
		while(i<=r)
		{
			fact2=fact2*i;
			i++;
		}
		System.out.println(r+" factorial is "+fact2);
		i=1;
		while(i<=x)
		{
			fact3=fact3*i;
			i++;
		}
		System.out.println(x+" factorial is "+fact3);
		System.out.println("npr value is "+ (fact1)/(fact2*fact3));
	}

}