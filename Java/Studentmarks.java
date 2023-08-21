class Student
{
public static void main(String[] args)
{
String name="Doodle";
int rollno=666;
char sec='a';
int fee=100000,scholar=0,donation=0;
int percentage=0;
int total_marks=500,amount=0,marks=0;
int s1=78,s2=89,s3=98,s4=88,s5=68;
marks=s1+s2+s3+s4+s5;
percentage=(int)(marks*100)/total_marks;
if (percentage>80)
{
donation=0;
scholar=20000;
}
else
{
donation=20000;
scholar=0;
}
amount=fee+donation-scholar;
System.out.println(name+"\n"+rollno+"\n"+sec+"\n"+amount);
System.out.println(scholar);
System.out.println(donation);
}
}
