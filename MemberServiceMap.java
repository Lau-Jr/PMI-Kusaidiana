import java.util.Map;
import java.util.HashMap;

class MemberServiceMap implements MemberService {
	
	Map<Integer, Member> members = new HashMap<Integer, Member>();
	
	public void addMember(Member member){//can this method handle exception
		
		members.put(member.getMemberId(),member);
		
	}

}