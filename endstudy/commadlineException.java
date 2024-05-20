class ExceptionCommandLine{
	public static void main(String args[]){
		int n=args.length;
		try{
			int div=10/n;
			System.out.println("divison is--->"+div);
		}
		catch(Exception ex){
			System.out.println("zero divison error");
		}
	}
}
