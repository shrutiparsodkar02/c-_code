class Calci{
	Calci(){
		System.out.println("default"+this);
	}
	String myToString(){
		return "mystring  "+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}

}
class Student extends Calci{
	public static void main(String args[]){
		Student s=new Student();
		Calci c=new Calci();
		System.out.println(c);
		System.out.println(s);
		System.out.println(c.myToString());
		System.out.println(s.myToString());
	}

}
