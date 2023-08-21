class Leap
{
	public static void main(String[] args)
	 {
		int a=1990,n=2023,count=0;
		while (n>=a)
		{
  		   if ((a%100!=0)||(a%4==0)|| (a%400==0))

			{
				System.out.println(n);
				
			}
      		n--;
			}
			
		
    }
}
 