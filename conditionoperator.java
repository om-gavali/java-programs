class conditionoperator
{
	public static void main(String args[])
	{
		  int n=5,flag=0;
		  
		 for(int i=2;i<n/2;i++)
		 {
			 if(n%i==0)
			 {
				 flag=1;
				 break;
			 }
		 }
		 
		 if(flag==1)
		 {
			 System.out.println("not prime");
		 }
		 else
		 {
			 System.out.println("prime");
		 }
	}
}