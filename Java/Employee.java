class Employee
{
public static void main(String[] args){

int bs=50000;
double da=20,hra=15,ta=10;
double pf=5,other=5,cop=2.5,tax=18,gs=0;
da=(20/100)*bs;
hra=15*bs/100;
ta=10*bs/100;
pf=5*bs/100;
other=5*bs/100;
cop=2.5*bs/100;
tax=18*bs/100;
gs=da+hra+ta-pf-other-cop-tax+bs;
System.out.println(gs);
}
}
