class OuterClass{
	private int number=10;
	 void display(){
		System.out.println(number);
	}
}
class demo{
	public static void main(String args[]){
		OuterClass o=new OuterClass();
		System.out.println(o.number);
	}
}
