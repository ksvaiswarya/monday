import java.util.Scanner;
class Automatic 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter num:");
	int x=s.nextInt();
	int count=0,rem=0,sq=0,y,sum=0,p=1,count2=0,temp=0,sq1=0,temp2=0;
        
        temp=x;
        
        System.out.println(sq);
	for(;x>0;x/=10)
	   {
	    count++;
	   }
sq=x*x;
temp2=x;
       for(;sq>0;sq/=10)
{
rem=sq%10;
count2++;
}

	for(;count>0;count--)
 	{
         p=p*10;
        }

   
   
   
	  
 if(temp2%p==temp)
	{
	System.out.println("Automatic");
	}
      else
	{
	System.out.println("Automatic");
	}
}
}


	

