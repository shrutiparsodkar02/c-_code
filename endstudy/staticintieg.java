class College{
	//static College c1=new College();
	static{
		System.out.println("inside college static 1 ");
	}
	{
		System.out.println("inside college init block 1");
	}
	College(){
		this(5);
		System.out.println("inside college default constructor"+this);
	}
	College(int x){
		System.out.println("inside college parameterised constructor"+this);
	}
	static{
		System.out.println("inside college static 2 ");
	}
	{
		System.out.println("inside college init block 2");
	}
	public String toString(){
		return "dhanshri";
	}
}
class School extends College{
	static School s1=new School();
	static{
		System.out.println("inside School static 1 ");
	}
	{
		System.out.println("inside School init block 1");
	}
	School(){
		this(5);
		System.out.println("inside School default constructor"+this);
	}
	School(int x){
		
		System.out.println("inside School parameterised constructor"+this);
	}
	static{
		System.out.println("inside School static 2 ");
	}
	{
		System.out.println("inside School init block 2");
	}
	public static void main(String args[]){
		School s=new School();
		College c=new College();
	}
}
