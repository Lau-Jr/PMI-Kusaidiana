import java.util.HashMap;

interface MemberService {
	
	public void addMember(Member member);//can this method handle exception
	
	public Member searchMember(int memberId);
	
	public HashMap<Integer, Member> getAllMembers();
	
	public void removeMember(Member member);//can this method handle exception


}