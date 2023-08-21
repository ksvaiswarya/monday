class Count
{
	public static void main(String[] args)
	 {
		int a=67869,count=0,rem=0,sum=0,pro=1;
		for(;a>0;a/=10)
		  {
			rem=a%10;
			count++;
			sum=sum+rem;
		      pro=pro*rem;
}
		if (count%2==0)
		  {
			
			System.out.println(sum);
		  }
		else
		{
		
            System.out.println(pro);
		}
 
}
}


 
