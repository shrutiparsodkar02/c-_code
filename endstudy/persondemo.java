import java.util.*;
import java.io.*;
class Person{
	int age;
	String name;
	Person(){
		this.age=20;
		this.name="shruti";
	}
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	void talk(){
		System.out.println("my age is-->"+age);
		System.out.println("my name is--->"+name);
	}
}
class DemoPerson{
	public static void main(String args[])throws Exception{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter age and name");
		int age=Integer.parseInt(sc.readLine());
		String name=sc.readLine();
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter age and name");
		//int age=Integer.parseInt(sc.nextLine());
		//String name=sc.nextLine();
		//Person p=new Person(30,"dhanshri");
		//p.age=20;
		//p.name="shruti";
		Person p=new Person(age,name);
		p.talk();
	}
}
