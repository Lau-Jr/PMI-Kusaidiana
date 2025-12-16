public class Contribution {
	
	static double fund;
	
	private int memberID;
	
	
	
	public Contribution(memberID, amount){
		contribute(memberID, amount);
		
	}
	
	public double contribute(memberID, amount){
		
		fund += amount;
		return 0;
	}
}