import java.util.*;

final class PMIKusaidianaAPP {
	
	private final MemberServiceMap ms;
	private boolean exit;

	public PMIKusaidianaAPP(){
		
		boolean exit = false;		
		ms = new MemberServiceMap();// Each Time App is Started, It will Start with Empty Members
	}
	
	private void displayAllMembers(){
		HashMap<Integer, Member> members = ms.getAllMembers();

		System.out.println();
		for(Member member: members.values()){
			System.out.printf("Name: %s, ID: %d",member.getFullname(), member.getMemberId());
		}
		System.out.println();

	}
	
	private void editMember(){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nMember ID: ");
		
		int memberID = input.nextInt();
		input.nextLine();///to clear new line.
		
		
		if(ms.members.containsKey(memberID)){
			
			Member member = ms.searchMember(memberID);
			System.out.printf("%nnew Full Name: ");
			String fullname = input.nextLine();
			member.setFullName(fullname);
			
			System.out.printf("%nUnit: ");
			String unit = input.nextLine();
			member.setUnit(unit);
			
			System.out.printf("%nMember Modification is successfully");	
			System.out.printf("%nnew Full Name is %s ",fullname);
			System.out.printf("%nnew Unit is %s%n",unit);			
		}
		else{
			System.out.printf("%nMember does not Exist%n");
		}
		
	}
	
	private static void displayMenu(String menu){
		System.out.println();
		System.out.println(menu);
		System.out.println();
		System.out.printf("%nChoose option: ");
	}
	
	private void exitMenuSwitch(){
		displayMenu(Menu.exitMenu);		
		Scanner input = new Scanner(System.in);
		int selectedExitMenu5 = input.nextInt();
		
		List<Integer> options = new ArrayList<>(Arrays.asList(1, 2));
		while(!options.contains(selectedExitMenu5)){
			displayMenu(Menu.exitMenu);
			selectedExitMenu5 = input.nextInt();
		}
		
		exit = selectedExitMenu5 == 1? true:false;
		
	}
	
	private void memberServiceSwitch(int memberMgmtSwitch){
		
		Member member;
		
		Scanner input = new Scanner(System.in);
		
		switch(memberMgmtSwitch){
			
			case 1:
				System.out.printf("%nFull Name: ");
				String fullName = input.nextLine();
				
				System.out.printf("%nUnit: ");
				String unit = input.nextLine();
				
				member = new Member(fullName, unit);
				ms.addMember(member);
				
				System.out.printf("%nMember registered successfully.");
				System.out.printf("%nMember ID: %d%n", member.getMemberId());
				break;
			
			case 2:
				System.out.printf("%nMember ID to remove: ");
				int memberID = input.nextInt();
				ms.removeMember(ms.searchMember(memberID));
				break;	
			
			case 3:
				editMember();
				break;
			
			case 4:
				displayAllMembers();
				break;
				
			default:
				System.out.printf("%nI'm Still Working on that Feature%n");	
			
		}
		
		
		
	}
	
	
	public static void main(String[] args){
		
		final PMIKusaidianaAPP app = new PMIKusaidianaAPP();//how to ensure there is only one? singleton pattern?? or is this wrong question as there is not need?
		Scanner input;
		boolean exitOptionSelected = false;
		
		do{
			input = new Scanner(System.in);
			displayMenu(Menu.mainMenu);		
			
			int selectedOption = input.nextInt();
		
			switch(selectedOption){
			
				case 1:
					displayMenu(Menu.memberMgmtMenu);
					int memberMgmtSwitch = input.nextInt();
					app.memberServiceSwitch(memberMgmtSwitch);
					break;
				
				case 5:
					app.exitMenuSwitch();
					exitOptionSelected = true;//or use break with lebel, this is flag
					break;
				default:
					System.out.printf("%n I'm Still Working on that Module%n");
				
				}
			if(!exitOptionSelected)
				app.exitMenuSwitch();			
		}while(!app.exit);
	input.close();
	}
}
