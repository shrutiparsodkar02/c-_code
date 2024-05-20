class Mount{
	int y=10;
	String School_name;
	Mount(int x,String s){
		School_name=s;
		System.out.println("in mount school"+x);
		System.out.println("school name is"+School_name);
	}
}
class Carmel extends Mount{
	String School_name;
	Carmel(int x,String s){
		super(1,"mount carmel convent high school");
		School_name=s;
		System.out.println("in carmel school"+x);
		System.out.println("school name is"+School_name);
	}
	public static void main(String args[]){
		Carmel c=new Carmel(2,"BJM");
	}
}
