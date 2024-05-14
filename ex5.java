class Dhamshri{
	
	public static void main(String args[]){
		
		try{	
			//System.out.println(s[2]);
			int n=args.length;
			int sum=45/n;
			int[]s={10,20,30};
			s[5]=80;
		}
		catch(ArithmeticException e){
			System.out.println("zero se divide hote huye kisne dekha tha barabr likh");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("array index aukat k bahar");
		}
		catch(Exception ex){
			System.out.println("Exception ka bapp >_<");
		}
		
	}

}
