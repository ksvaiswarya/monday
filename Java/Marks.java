//interview question
class Marks
{
public static void main(String[] args)
{
int a=20,b=10,c=30;
if (a>b)
{
a=a+b;
b=a-b;
a=a-b;
}
if (a>c)
{
a=a+c;
c=a-c;
a=a-c;
}
if (b>c)
{
b=b+c;
c=b-c;
b=b-c;
}
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}


