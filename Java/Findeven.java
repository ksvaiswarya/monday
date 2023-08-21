class Find
{
public static void main(String[] args)
{
 int n=1754,add=0,rem=0;
 for(;n>0;n/=10)
 {
	rem=n%10;
     	if (rem%2==0)
      {
		add=rem+2;
	}
	else
		add=rem+1;
System.out.println(add);
   }
} 
}    