class Instancevaluechange{
	static int x=10;
	/*Instancevaluechange(int x1){
		x=x1;
	}*/
	static void display(){
		System.out.println(x);
	}

}
class Instancevaluechange2{
	public static void main(String args[]){
		Instancevaluechange ec=new Instancevaluechange();	
		ec.display();
		Instancevaluechange ec1=new Instancevaluechange();	
		ec1.x=20;
		ec1.display();
		//Instancevaluechange ec=new Instancevaluechange();	
		ec.display();
		
	}
}
