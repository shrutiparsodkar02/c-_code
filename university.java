class University{
	String uniName;
	University(String uniName){
		this.uniName=uniName;
		System.out.println(uniName);
	}
	void displayUniName(){
		System.out.println(uniName);
	}
	public static void main(String args[]){
		University u=new University("sggs");
		u.displayUniName();
	}
}
