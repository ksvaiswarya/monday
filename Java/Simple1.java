class Simple
{
public static void main(String[] args)
{
int a=77;
if ((a%3==0) | (a%5==0))
    System.out.println("Fizz Buzzz");
else if (a%3==0)
    System.out.println("Fizz");
else if (a%5==0)
    System.out.println("Buzz");
else
    System.out.println(a);
}
}