import java.util.Scanner;
class App
{
public static void main(String[] args)
{
	
	int quantity=0;
	int price=0;
	int capacity=0;
	int warranty=0,size=0,total=0;
      String color=" ";
boolean b=false;

     
	int code=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Welcome to our Shop!!");
	System.out.println("1.Refrigerator");
	System.out.println("2.AC");
	System.out.println("3.Fan");
	System.out.println("4.Washing machine");
	
	System.out.println("Enter your choice(1-4):");
	int choice=s.nextInt();
      

switch(choice)
{ 
	case 1:
      System.out.println("Samsung");
      System.out.println("LG");
      System.out.println("Haier");
	System.out.println("Whirlpool");
	System.out.println("Enter brand:");
      String brand=s.next();
         if (brand.equals("Samsung"))
		{
		color="Blue";
		 capacity=210;
		 warranty=14;
		 price=20000;
            code=102;
              System.out.println("color:"+color);
              System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"L");
		 System.out.println("Code:"+code);

		}
	else if(brand.equals("LG"))
		{
		 color="White";
		 capacity=220;
		 warranty=10;
		 price=26000;
		 code=103;
	        System.out.println("color:"+color);
              System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"L");
		System.out.println("Code:"+code);
		}
      else if(brand.equals("Haier"))
		{
		 color="Black";
		 capacity=400;
		 warranty=20;
		 price=150000;
		 code=104;
	       System.out.println("color:"+color);
             System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"L");
		System.out.println("Code:"+code);

		}
     else if(brand.equals("Whirlpool"))
		{
		 color="White";
		 capacity=270;
		 warranty=10;
		 price=40000;
		 code=105;
            System.out.println("color:"+color);
            System.out.println("Warranty:"+warranty+"years");
	     System.out.println("Price:"+price+"/-");
	     System.out.println("Capacity:"+capacity+"L");
		System.out.println("Code:"+code);

		}
 
     break;

case 2:

      System.out.println("Samsung");
      System.out.println("LG");
      System.out.println("Haier");
	System.out.println("Voltas");
	System.out.println("Enter brand:");
      brand=s.next();
         if (brand.equals("Samsung"))
		{
		
		 capacity=1;
		 warranty=10;
		 price=32000;
             code=130;
              System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"Ton");
	       System.out.println("Code:"+code);

		}
	else if(brand.equals("LG"))
		{
		 capacity=3;
		 warranty=10;
		 price=36000;
	       code=131; 
              System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"Ton");
		System.out.println("Code:"+code);
		}
      else if(brand.equals("Haier"))
		{
		
		 capacity=2;
		 warranty=20;
		 price=50000;
	       code=132;
             System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"Ton");
		System.out.println("Code:"+code);

		}
     else if(brand.equals("Voltas"))
		{
		 
		 capacity=2;
		 warranty=10;
		 price=40000;
            code=133;
            System.out.println("Warranty:"+warranty+"years");
	     System.out.println("Price:"+price+"/-");
	     System.out.println("Capacity:"+capacity+"Ton");
          System.out.println("Code:"+code);

		}
 
     break;
case 3:

      System.out.println("Usha");
      System.out.println("Crompton");
      System.out.println("Havells");
	System.out.println("Enter brand:");
      brand=s.next();
         if (brand.equals("Usha"))
		{
		color="Red";
		 size=14;
		 warranty=6;
		 price=32000;
             code=112;
              System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"Ton");
	       System.out.println("Code:"+code);
		  System.out.println("Size:"+size);
             }
	else if(brand.equals("Crompton"))
		{
		color="Green";
		 size=14;
		 warranty=10;
		 price=36000;
	       code=113; 
              System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Code:"+code);
		System.out.println("Size:"+size);
		System.out.println("Color:"+color);

			
		}
      else if(brand.equals("Havells"))
		{
		 size=12;
		 color="White";
		 warranty=20;
		 price=2000;
	       code=114;
             System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Code:"+code);
		System.out.println("Size:"+size);
		System.out.println("Color:"+color);
		}
     break;

case 4:

      System.out.println("Samsung");
      System.out.println("LG");
      System.out.println("Haier");
	System.out.println("Whirlpool");

	System.out.println("Enter brand:");
      brand=s.next();
         if (brand.equals("Samsung"))
		{
		capacity=6;
		 warranty=5;
		 price=32000;
             code=140;
              System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"kg");
	       System.out.println("Code:"+code);
		  
            }
	else if(brand.equals("LG"))
		{
		
		 capacity=9;
		 warranty=10;
		 price=36000;
	       code=141; 
              System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"kg");
		System.out.println("Code:"+code);
		}
      else if(brand.equals("Haier"))
		{
		 capacity=7;
		 warranty=4;
		 price=42000;
	       code=142;
             System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"kg");
		System.out.println("Code:"+code);
		}
else if(brand.equals("Whirlpool"))
		{
		 capacity=10;
		 warranty=4;
		 price=50000;
	       code=143;
             System.out.println("Warranty:"+warranty+"years");
	       System.out.println("Price:"+price+"/-");
	       System.out.println("Capacity:"+capacity+"kg");
		System.out.println("Code:"+code);
		}
     break;
default:
b=true;
System.out.println("You entered wrong choice.");

}
if(b==false){
System.out.println("Please Enter Quantity:");
quantity=s.nextInt();
System.out.println("Quantity:"+quantity);
total=quantity*price;
System.out.println("total:"+total);
System.out.println("THANK YOU FOR SHOPPING!");
System.out.println("VISIT AGAIN!");
}
}

	
 }         
     

            
  		  
              
		  
 



