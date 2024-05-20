class University{
	String UniName;
	
	University(String uName){
		UniName=uName;
	}
	void displayUni(){
		
		System.out.println(UniName);
	}
}
class EngCollege extends University{
	String clgName;
	Department d;
	EngCollege(String engclgName){
		super("smrtu");
		clgName=engclgName;
	}
	void displayegnclg(Department obj1){
		this.d=obj1;
		System.out.println(clgName);
		System.out.println("**"+d.deptName);
	}
	class Department{
		String deptName;
		Department(String deptName){
			this.deptName=deptName;
		}	
		void displaydept(){
			System.out.println(deptName);
			System.out.println("***"+clgName);
		}
	}
	public static void main(String args[]){
		EngCollege egc=new EngCollege("sggs");
		Department d=egc.new Department("IT");
		egc.displayUni();
		egc.displayegnclg(d);
		d.displaydept();
	}
}
