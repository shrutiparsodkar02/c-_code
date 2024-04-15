class Ex2{
	public static void main(String args[]){
	//in java it is complusory to initialize
		double a=0;
		try{
			System.out.println("opening file");
			int n=args.length;
			System.out.println("length-->"+n);
			a=45/n;
			
		
		}
		
		/*catch(Exception ex){
			ex.printStackTrace();
		}*/
		finally{
			System.out.println("division--->"+a);
			System.out.println("closing file");
		}
		
	}


}
//if we didnt write catch block its ok but if we write catch block it is nesscary to write try
//we can aslo write only try and finally block then try will executed then finally and then exception will occur

