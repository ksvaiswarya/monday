class Hfactor
{
public static void main(String args[])
	{
	   int a=1,b=6,res=0;
	   while(a<b)
		{
            if (b%a==0)
         	   {
                res=res+a;

		   }
		a++;
           }
  	     System.out.println(res);
}
}
	   