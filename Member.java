public class Member {
	
	private static int members;
	private final int memberId;
	private String fullName;
	private String unit;
	private final int monthlyContribution;
	private double totalPaid;
	
	public Member(String fullName, String unit){
		members ++;
		setFullName(fullName);
		setUnit(unit);
		memberId = members;
		monthlyContribution = 10000;
		totalPaid = 0;
	}
	
	public int getMemberId(){
		
		return this.memberId;
	}
	
	public void updateTotalPaid(double amount) {
		if (totalPaid < monthlyContribution) {
			totalPaid += amount;
			return;
		}
		throw new RuntimeException("Contribution Exceeds Monthly Limit");
	}
	public double getTotalPaid(){
		
		return this.totalPaid;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit){
		this.unit = unit;		
	}

	public String getFullName() {
		return fullName;
	}
}