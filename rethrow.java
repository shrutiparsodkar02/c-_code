class A{
	
		void StringDisplay(){
			try{
				String s1="hello";
				char s2=s1.charAt(6);
				System.out.println(s2);
			}
	
			catch(StringIndexOutOfBoundsException se){
				System.out.println("please see index is within range");
				throw se;
			}
	}
}
class B{
	public static void main(String args[]){
		A a= new A();
		try{
			a.StringDisplay();
		}
		catch(StringIndexOutOfBoundsException se){
			System.out.println("catch rethrown exception");
		}
	}

}
