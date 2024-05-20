//imp note catch must be preced by try and finally must be preced by try me can only use one finally with one try
//ones exception occured it will search for catch block it will never come back to try to execute further
import java.util.*;
class exceptionEg1{
	void division(int d){
		int arr[]={10,20,30};
		try{	
			int x=arr[4];
			int num=10/d;
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
			System.exit(1);
		}
		finally{
			System.out.println("exception handling process...");
		}
		/*try{
		}
		finally{
		
		}*/
	
	}
	public static void main(String args[]){
		exceptionEg1 excep=new exceptionEg1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter denominator");
		int d=sc.nextInt();
		excep.division(d);
	}
}
