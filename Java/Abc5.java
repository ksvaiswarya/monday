import java.util.Scanner;
	public class Abc5
{
	public static void main(String[] args)
{
	int a;
	double b;
	char c;
	String d;
	System.out.println("enter input values");
	Scanner s=new Scanner(System.in);
	System.out.println("enter int value:");
	a=s.nextInt();
	System.out.println("enter double value:");
	b=s.nextDouble();
	System.out.println("enter char values");
	c=s.next().charAt(0);
	System.out.println("enter a sentence:");
	s.nextLine();
	d=s.nextLine();
System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
}
}