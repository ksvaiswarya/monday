class Swap
{
public static void main(String[] args)
{
int a=35,b=20;
System.out.println("Before Swapping:");
System.out.println(a);
System.out.println(b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping:");
System.out.println(a);
System.out.println(b);
}
}