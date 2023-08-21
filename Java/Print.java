import java.util.Scanner;
class Find
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int a=s.nextInt(),rem=0,sum=0;
for(;a>0;a/=10)
{
rem=a%10;
System.out.println(rem);
sum=sum*10+rem;

}
for(;sum!=0;sum/=10)
{
rem=sum%10;
System.out.println(rem);
}
}
}


