import java.util.*;
class DivisionByZero{
	int div;
	int divison(int num,int den){
		try{
			div=num/den;
			return div;
		}
		catch(Exception ex){
			throw ex;
		}
	}
	public static void main(String args[]){
		DivisionByZero divzero=new DivisionByZero();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter numerator");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("enter denominator");
		int den=Integer.parseInt(sc.nextLine());
		int div1=0;
		try{
			div1=divzero.divison(num,den);
		}
		catch(Exception ex){
			int i=0;
			while(i<5){
				if(den==0){
					try{
						System.out.println("re-enter denominator");
						den=Integer.parseInt(sc.nextLine());
						divzero.divison(num,den);
					}
					finally{
						if(div1>0){
							System.out.println("divison is-->"+div1);
						}
		
					}
				}
				i++;
			}
			
		}
		
	
	
	}
}
