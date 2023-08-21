class Array {
	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70};
		int b[]=new int[a.length];
		int x,temp;
		for(x=0;x<4;x++)
		{
           b[x]=a[x];
		}
		int i=a.length-1;
		for(;x<a.length;x++)
		{
		b[x]=a[i];
i--;
		}
		for(int var:b)
			System.out.println(var+" ");
	
	}

}