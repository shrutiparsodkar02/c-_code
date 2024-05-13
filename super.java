class Mount{
	int s;
	Mount(int s){
		this.s=s;
	}
	void Display(){
		System.out.println(s);
	}
}
class Carmel extends Mount{
	int a;
	Carmel(int a){
		super(a);
		this.a=a;
	}
	public static void main(String args[]){
		Carmel c=new Carmel(5);
		c.Display();
	}
}
