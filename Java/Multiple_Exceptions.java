class Main123
{
public static void main(String args[])
{
        int arr[]=new int[]{10,20};
        try
	{
	System.out.println(10/0);
	System.out.println(arr[4]);
	}
	catch(Exception b)
	{
	 System.out.println("i am in catch");
	}
}
}