class High
{
public static void main(String[] args)
{
int a=100,b=200,c=300;
if (a>b)
{ 
   if (a>c)
     System.out.println("a is greater");
   else
     System.out.println("c is greater");
}
else if (b>a)
{
   if (b>c)
      System.out.println("b is greater");
   else
     System.out.println(" c is greater");
}
else if (c>a)
    {
      if (c>b)
        System.out.println("c is greater");
      else
        System.out.println("b is greater");
}

}
}



