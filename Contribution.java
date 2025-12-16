import java.time.LocalDateTime;

public class Contribution {
	
	private static double fund;
	
	private Member member;
	
	private double amount;

	private LocalDateTime createdAt;
	
	
	
	public Contribution(Member member, double amount){
		this.member = member;
		this.amount = amount;
		contribute(this.member, this.amount);
		this.createdAt = LocalDateTime.now();
		
	}
	
	private void contribute(Member member, double amount){//causes ContributionExceedException
		member.updateTotalPaid(amount);
		fund += amount;
		}

    public double getFund() {
        return fund;
    }

}