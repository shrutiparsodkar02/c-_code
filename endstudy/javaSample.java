class Stringdemo{
	public static void main(String args[]){
		String s1="sggs";
		String s2="Shruti";
		String s4="shruti";
		String s3=new String("sggs shruti");
		Stringdemo sd =new Stringdemo();
		char []arr={'s','j','l','m','n','p'};
		String shruti=new String(arr,2,1);
		String s10="name is my /shruti is/hahahha   /yruruu  /h ";
		String s11="is";
		String s12="  dhanshri   mane    madam  ";
		char []aar2=new char[25];
		String s[];
		String s20="hello";
		String s30=new String("hello");
		//System.out.println(s2.compareToIgnoreCase(s4));
		//System.out.println(s1);
		//System.out.println(sd);
		//System.out.println(s3.equals(s2));
		//System.out.println(s2.equals(s4));
		//System.out.println(s4==s2);
		//System.out.println(shruti);
		//SySystem.out.println(s10.lastIndexOf(s11));
		//System.out.println(s12.trim());
		s10.getChars(3,10,aar2,0);
		//System.out.println(dhn);
		s=s10.split("/");
		/*for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}*/
		System.out.println(s20==s30);
		System.out.println(s20=s30);//it assigns the value of s20 to s30
		System.out.println(s20.equals(s30));
		
	}
	public String toString(){
		return(getClass())+"@"+Integer.toHexString(hashCode());
	}
}










