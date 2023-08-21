class Factor
{
public static void main(String[] args)
{
int a=1,n=6,count=0;
while (a<=n)
{
 if (n%a==0)
{
 count=count+1;
}
a++;
}
if (count==2)
{
 System.out.println("It is a prime number");
}
else
{
  System.out.println("It is not a prime number");
}
}
}
