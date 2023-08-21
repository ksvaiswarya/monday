class Fact2
{
    public static void main(String[] args)
     {
	Main m=new Main();
	m.x=5;
	int res=m.calFact();
	System.out.println(res);

      }
}
class Main
{
int x;
public int calFact()
{

	int fact=1;
	for (;x>0;x--)
	{
	fact=fact*x;
	}
return fact;
}
}