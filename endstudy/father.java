class Father{
	int x=100;
	
	Father(){
	
		System.out.println("my"+x);
		//Father(7);
		//this(5);
		//super(5);
		//return 0;--->constructor cannot write return type there
	}
	Father(int x1){
		x=x1;
		System.out.println("my"+x);
	}
	void display(){
		System.out.println("my"+x);
	}
	public static void main(String args[]){
		Father son=new Father(200);
		Father daughter=new Father(300);
		Father son1=new Father();
		
		son.display();	
		
		daughter.display();
		
		son1.display();	
		//System.out.println(son);
	}
}




