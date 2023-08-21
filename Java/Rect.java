class Rect
{
public static void main(String args[])
{
int l=5,b=4,area=0,peri=0;
area=l*b;
peri=2*l+b;
if (area>peri)
    System.out.println("Area is greater than perimeter");
else
    System.out.println("Area is not greater than peimeter");
}
}