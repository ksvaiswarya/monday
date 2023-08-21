class Fact1
{
public static void main(String[] args)
{
 Fact1 f=new Fact1();
f.calFact();
}


public void calFact()
{
 	int fact=1,x=5,res;
	for(;x>0;x--)
	{
	   fact=fact*x;
	}
System.out.println(fact);

}
}