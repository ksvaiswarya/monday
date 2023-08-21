import java.util.Scanner;
	class Abc
{
	public static void main(String[] args)
{
	int a;
	double b;
	char c;
	String d;
	System.out.println("Enter Inputs:");
	Scanner S=new Scanner(System.in);
	System.out.println("Enter integer input:");
	a=S.nextInt();
   	System.out.println("Enter Double input:");
	b=S.nextDouble();
	System.out.println("Enter Char input:");
	c=S.next().charAt(0);
	System.out.println("Enter a Sentence or a Word:");
	d=S.nextLine();
System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
}
}