class Ex3{
	int s=0;
	void ArithmaticOperations(){
		try{
			int[] arr={10,20};
			int n=arr[0];
			s=45/n ;
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			System.out.println("division is-->"+s);
		}
	}
	void ArrayOperations(){
		try{
			int[] arr2={10,20,30};
			arr2[7]=10;
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			System.out.println("adding array elements");
		}
		finally{
			System.out.println("adding array elements");
		}
	}
}
class child{
	public static void main(String args[]){
		Ex3 e= new Ex3();
		e.ArithmaticOperations();
		e.ArrayOperations();
	}
}
