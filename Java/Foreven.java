 class Even
 {
	public static void main(String[] args) 
	{

		int num=2579,sum=0,rem=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			if (rem%2==0)
                   System.out.println(rem);

		}
		
		
	}

}
