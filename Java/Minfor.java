class Min
{
public static void main(String[] args)
{
int n=5864,rem=0,min=1;
for (;n>0;n/=10)
{
rem=n%10;
if (min>=rem)
{
min=rem;
}
}
System.out.println(min);
}
}