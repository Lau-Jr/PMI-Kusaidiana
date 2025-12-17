import java.util.Map;
import java.util.HashMap;

class MemberServiceMap implements MemberService {
	
	Map<Integer, Member> members;
	
	
	public MemberServiceMap(){
		
		 members = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member){//can this method handle exception
		
		members.put(member.getMemberId(),member);
		
	}

	public void displayAllMembers(){
		HashMap<Integer, Member> members = getAllMembers();

		System.out.println();
		for(Member member: members.values()){
			System.out.printf("%nName: %s, ID: %d",member.getFullName(), member.getMemberId());
		}
		System.out.println();

	}
	
	public Member searchMember(int memberId){//handle if no members added
	
		return members.get(memberId);// returns null if key is not found or its value is null.
	}
	
	public HashMap<Integer, Member> getAllMembers(){
		
		return (HashMap)members;
	}
	
	public void removeMember(Member member){//can this method handle exception
		
		int mid = member.getMemberId();
		
		members.remove(mid);
		System.out.printf("%n Member with id %d is Successfully Removed.%n",mid);
		
	}
		
}