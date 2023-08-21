class Find
{
public static void main(String args[])
{
  char a='A';
 if (a>='A' && a<='Z')
    System.out.println((int)(a));
else if (a>='0'&& a<='9')
    System.out.println((int)(a));
else if (a>='a' && a<='z')
System.out.println((int)(a));
else
System.out.println("symbols");

}
}