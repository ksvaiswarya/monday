class Gcd
   {
	public static void main(String[] args)
	{
		int x=1,y=10,z=20,res=0;
 		while((x<=y) && (x<=z))
		{
		  if ((y%x==0) && (z%x==0))
             {
              res=x;

             }
		x++;
		}
System.out.println(res);
       }
}

         
	