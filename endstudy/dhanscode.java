
class Father{
	static long balance=1000;
	 static String surname;
	 static String name;
	/*Father(){
		surname=s1;
		name=s2;
	}*/
	/*void setSurname(String s){
		//this.surname=s;
		surname=s;
	}
	void setName(String s){
		this.name=s;
		//
		name=s;
	}*/
	/*public static void main(String args[]){
		Father s1=new Father();
		System.out.println("HashCode Of Object-->"+s1.hashCode());
		System.out.println("HexString-->"+Integer.toHexString(s1.hashCode()));

		System.out.println("Father"+"@"+Integer.toHexString(s1.hashCode()));
		System.out.println(s1);
	}
	public String toString(){
		return "Address";
	}*/
	void display(){
		System.out.println(surname);
		System.out.println(name);
	}
}
class Mother{
	public static void main(String args[]){
		Father s1=new Father();
		/*System.out.println(s1.surname);
		System.out.println(s1.name);
		s1.surname="Baswade";
		s1.name="Dhanshri";*/
		//System.out.println(s1.surname);
		//System.out.println(s1.name);
		s1.surname="parsodkar";
		s1.name="shruti";
		s1.display();
	}
}



