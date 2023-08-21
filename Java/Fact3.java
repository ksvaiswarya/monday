class Fact3
{
    public static void main(String[] args)
     {
	Main m=new Main();
 int res=m.calFact(5);
System.out.println(res);
}

}
class Main
{
public int calFact(int x)
{

	int fact=1;
	for (;x>0;x--)
	{
	fact=fact*x;
	}
return fact;
}

}