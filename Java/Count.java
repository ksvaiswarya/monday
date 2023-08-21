class Count
{
public static void main(String[] args)
{
  int x=1, ecount=0,ocount=0;
  while (x<=10)
   {
    if (x%2==0)
    ecount++;
    else
{
    ocount++;
}
x++;
}
System.out.println("Even are:"+ecount);
System.out.println("Odd are:"+ocount);
}
}

