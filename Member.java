class Member {
	
	private static int members;
	private int memberId;
	private String fullname;
	private String unit;
	private int monthlyContribution;
	private double totalPaid;
	
	public Member(String fullname, String unit){
		members ++;
		setFullName(fullname);
		setUnit(unit);
		memberId = members;
		monthlyContribution = 10000;
		totalPaid = 0;
	}
	
	public int getMemberId(){
		
		return this.memberId;
	}
	
	public void updateTotalPaid(double amount){
		
		totalPaid += amount;
	}
	
	public double getTotalPaid(){
		
		return this.totalPaid;
	}

	public void setFullName(String fullname){
		this.fullname = fullname;
	}
	
	public void setUnit(String unit){
		this.unit = unit;		
	}
	
	
}