//Student application

class Student
{
public static void main(String[] args)
{
String name="Joey";
int total=0,scholar=0,dona=0;
double percentage=0,max=500,fee=100000;
int s1=80,s2=88,s3=97,s4=64,s5=99;
total=s1+s2+s3+s4+s5;
percentage=total/max*100;
if ((percentage>=35) && (percentage<60))
{
scholar=1000;
dona=25000;
}
else if((percentage>=60) && (percentage<75))
{
scholar=2000;
dona=15000;
}
else if((percentage>=75) && (percentage<85))
{
scholar=5000;
dona=10000;
}
else if((percentage>=85) && (percentage<95))
{
   scholar=10000;
dona=5000;
}
else if(percentage>=95)
{
scholar=25000;
dona=0;
}
fee=fee+dona-scholar;
System.out.println(fee);
System.out.println(percentage);
System.out.println(dona);
System.out.println(scholar);

}
}
