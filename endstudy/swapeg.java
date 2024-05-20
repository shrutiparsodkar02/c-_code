class SwapwithoutUsingThirdVariable{
	int x=5;
	int y=10;
	void display(){
		System.out.println("value of x is--> "+x+" value of y is--> "+y);
	}
	void swap(){
		x=x+y;//x=15
		y=x-y;//y=5
		x=x-y;//y=10
	}
	public static void main(String args[]){
		SwapwithoutUsingThirdVariable swp=new SwapwithoutUsingThirdVariable();
		swp.display();
		swp.swap();
		System.out.println("After swapping--->");
		swp.display();
		
	}

}
