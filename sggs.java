class SGGS extends College{
	void reName(String s){
		System.out.println("new name is-->"+s);
	}
	public String myToString(){
		return "myToString"+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	/*public String toString(){
		return "tinu";
	}*/
	public static void main(String args[]){
		College c=new College();
		SGGS s=new SGGS();
		s.display("shruti");
		s.reName("dhanshri");
		System.out.println(s);
		System.out.println(c);
		System.out.println(s.myToString());
	}

}
