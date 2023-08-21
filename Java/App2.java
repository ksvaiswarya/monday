package loops;
import java.util.Scanner;

public class Medplus {
	public static void main(String[] args)
	{
		String disease;
		String tablet;
		int quantity;
		int price;
		String item;
		int code;
		int MFG;
		int EXP;
		String name;
		int age;
		int choice;
		Scanner s =new Scanner(System.in);
		//System.out.println("Enter name:");
		//name=s.next();
		//System.out.println("Enter age:");
		//age=s.nextInt();
	
		//System.out.println("Enter choice between(1-5):");
		
		System.out.println("1.Pharmacy");
		System.out.println("2.Diagnostics");
		System.out.println("3.Baby care");
		System.out.println("4.OTC & HealthCare");
		System.out.println("5.Ayurvedic");
		System.out.println("Enter choice between(1-5):");
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Fever");
			System.out.println("Vomitings");
			System.out.println("Headache");
			System.out.println("Cold & Cough");
			System.out.println("Enter Disease:");
			disease=s.next();
			if(disease.equals("Fever"))
			{
				tablet="Paracetmol";
				price=20;
				code=13455;
				 MFG=20/04/2023;
				 EXP=27/07/2024;
				 System.out.println("Tablet:"+tablet+"\n"+"Price:"+price+"\n"+"code:"+code+"\n"+"MFG:"+MFG+"\n"+"EXP:"+EXP);
			}
				 
			else if(disease.equals("Vomitings"))
			{
				
				tablet="Doxinate";
				price=50;
				code=15689;
				MFG=20/8/2022;
				EXP=28/9/2027;
				System.out.println("Tablet:"+tablet+"\n"+"Price:"+price+"\n"+"code:"+code+"\n"+"MFG:"+MFG+"\n"+"EXP:"+EXP);
			}
			else if(disease.equals("Headache"))
			{
				tablet="Aspirin";
				price=89;
				code=15688;
				MFG=20/8/2022;
				EXP=28/9/2027;
				System.out.println("Tablet:"+tablet+"\n"+"Price:"+price+"\n"+"code:"+code+"\n"+"MFG:"+MFG+"\n"+"EXP:"+EXP);
			}
			else if(disease.equals("Cold & Cough"))
			{
			tablet="Polergy";
			price=55;
			code=15679;
			MFG=15/8/2022;
			EXP=28/9/2027;
			System.out.println("Tablet:"+tablet+"\n"+"Price:"+price+"\n"+"code:"+code+"\n"+"MFG:"+MFG+"\n"+"EXP:"+EXP);
		}
		break;
		case 2:
case 2:
			System.out.println("FirstAidKit");
			System.out.println("Thermometer");
			System.out.println("Diabetictester");
			System.out.println("Stethoscope");
			System.out.println("BPMachine");
			System.out.println("WeighingMachine");
			System.out.println("Enter Instrument:");
			instrument=s.next();
			if(instrument.equals("FirstAidKit"))
			{
				
				price=3000;
				code=87898;
				String mtype="Normal";
				System.out.println("Price:"+price+"\n"+"code:"+code+"\n"+"mtype:"+mtype);
			}
			
			else if(instrument.equals("Thermometer"))
			{
				
				price=200;
				code=12456;
				String mtype="Automatic";
				System.out.println("Price:"+price+"\n"+"code:"+code+"\n"+"mtype:"+mtype);
			}
			
			else if(instrument.equals("Diabetictester"))
			{
				
				price=12;
				code=65789;
				String mtype="Automatic";
				System.out.println("Price:"+price+"\n"+"code:"+code+"\n"+"mtype:"+mtype);
			}
			else if(instrument.equals("Stethoscope"))
			{
				
				price=2600;
				code=12356;
				String mtype="Normal";
				System.out.println("Price:"+price+"\n"+"code:"+code+"\n"+"mtype:"+mtype);
			}
			else if(instrument.equals("BPMachine"))
			{
				
				price=2900;
				code=87176;
				String mtype="Normal";
				System.out.println("Price:"+price+"\n"+"code:"+code+"\n"+"mtype:"+mtype);
			}
			else if(instrument.equals("WeighingMachine"))
			{
				
				price=1500;
				code=76542;
				String mtype="Normal";
				System.out.println("Price:"+price+"\n"+"code:"+code+"\n"+"mtype:"+mtype);
			}
			break;
			
			
	}
	

}
