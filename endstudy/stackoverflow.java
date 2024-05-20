class StackoverflowExample{
	//StackoverflowExample s2=new StackoverflowExample();
	StackoverflowExample(){
		System.out.println("shruti***");
		//stackoverflowExample s1=new StackoverflowExample();
	}
	void display(StackoverflowExample s1){
		System.out.println("shruti");
		new StackoverflowExample();
	}
	
	public static void main(String args[]){
		StackoverflowExample s1=new StackoverflowExample();
		s1.display(s1);
	}

}
