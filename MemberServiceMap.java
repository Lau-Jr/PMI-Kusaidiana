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
	
	public Member searchMember(int memberId){//handle if no members added
	
		return members.get(memberId);
	}
	
	public HashMap<Integer, Member> getAllMembers(){
		
		return (HashMap)members;
	}
	
	public void removeMember(Member member){//can this method handle exception
		
		members.remove(member.getMemberId());
		
	}
		
}