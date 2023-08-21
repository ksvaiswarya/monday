class Mul
{
public static void main(String[] args)
{
int x=1,t=9,res=1;
while (x<=25)
{
res=x*t;
if (res%2!=0)
{
System.out.println(t+" "+"x"+" "+x+"="+" "+res);
}
x++;

}
}
}