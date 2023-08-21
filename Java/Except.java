class Main
{
public static void main(String args[])
{
        int a[]=new int[]{10,20};
        try
	{
	System.out.println(10/0);
	System.out.println(a[4]);
	}
	catch(Exception ab)
	{
	 System.out.println("i am in catch");
	}
}
}