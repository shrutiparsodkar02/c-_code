class TestClass{
	void printArray(int[] arr)throws RuntimeException{
		for(int i=0;i<=arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])throws RuntimeException {
		TestClass t1=new TestClass();
		int[] arr={1,2,3};
		t1.printArray(arr);
		
	}
}
