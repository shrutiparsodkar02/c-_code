//function overloading
//if we take diffrent return type also it does matter it will give error
class FunctionOverloadingExample{
	/*int function1(int a,long b){
		System.out.println("void  onces");
		return a+b;
	}*/
	int[] function1(int a,int...b,String s){
		System.out.println("long onces");
		return a+b;
	}
	public static void main(String args[]){
		FunctionOverloadingExample fc=new FunctionOverloadingExample();
		System.out.println(fc.function1(Integer.MAX_VALUE,1,""));
	}
}
