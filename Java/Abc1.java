import java.util.Scanner;
	public class Abc3
{
	public static void main(String[] args)
{
	int a;
	double b;
	char c;
	String d;
	System.out.println("enter int,double,char,string values");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextDouble();
	c=s.next().charAt(0);
	d=s.nextLine();
System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
}
}