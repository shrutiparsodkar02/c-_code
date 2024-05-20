class ThisExample{
	int x;
	ThisExample(){
		this(55);
		this.access();
	}
	ThisExample(int x){
		//this(55);
		this.x=x;
		
	}
	void access(){
		System.out.println(x);
	}
	public static void main(String args[]){
		ThisExample te=new ThisExample();
	}
}
