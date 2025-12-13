class Member {
	
	private static int members;
	private int memberId;
	private String fullname;
	private String unit;
	private int monthlyContribution;
	private double totalPaid;
	
	public Member(String fullname, String unit){
		members ++;
		this.fullname = fullname;
		this.unit = unit;
		memberId = members;
		monthlyContribution = 10000;
		totalPaid = 0;
	}
	
	public int getMemberId(){
		
		return this.memberId;
	}
	
	
}