interface voter{
	void casteVote();
}
interface EC{
	void checkValidity();
}
class ECindia implements voter,EC{
	int minage=18;
	int age=0;
	ECindia(int age){
		this.age=age;
	}
	public void casteVote()throws IndianVoterException {
		if(age<minage){
			IndianVoterException ev=new IndianVoterException("you cannot caste vote!!!");
			throw ev;
			//System.out.println("you cannot caste vote!!!");
		}
	}
	public void checkValidity(){
	}
}
class FinalImplementation{
	public static void main(String args[])throws Exception{
		ECindia ei=new ECindia(5);
		ei.casteVote();
	}
}
class IndianVoterException extends Exception{
	IndianVoterException(String msg){
		super(msg);
	}
}
