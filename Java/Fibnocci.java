class Fibnocci
{
public static void main(String[] args)
{
 int a=0,b=1,res=0;
while ((a<=10))
{
a=b;
b=res;
res=a+b;
System.out.println(res);

a++;

}
}
}