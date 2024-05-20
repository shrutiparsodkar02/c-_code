/*important point when we use buffer reader class we take input from readline and when we use scanner class we use nextLine function*/

import java.io.*;
import java.util.*;
class SearchString{
	public static void main(String args[])throws Exception{
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner br=new Scanner(System.in);
		System.out.println("enter the strings how many you want to store");
		int num=Integer.parseInt(br.nextLine());
		String arr[]=new String[num];
		for(int i=0;i<num;i++){
			System.out.println("enter the string:-->");
			arr[i]=br.nextLine();
		}
		System.out.println("you have enter strings are-->");
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("enter string you want to enter--->");
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String search=br.nextLine();
		System.out.println("String to search-->"+search);
		for(int i=0;i<arr.length;i++){
			if(search.equalsIgnoreCase(arr[i])){
				System.out.println("String found at position--->"+(i+1));
				
			}
			else{
				System.out.println("not found");
			}
		}
		
	}
}
