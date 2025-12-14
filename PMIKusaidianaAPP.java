import java.util.Scanner;

final class PMIKusaidianaAPP {
	
	MemberServiceMap ms;

	public PMIKusaidianaAPP(){
		
		ms = new MemberServiceMap();// Each Time App is Started, It will Start with Empty Members
	}
	
	private static void displayMenu(String menu){
		System.out.println();
		System.out.println(menu);
		System.out.println();
		System.out.printf("%nChoose option: ");
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
						
				
			default:
				System.out.printf("%nI'm Still Working on that Feature%n");	
				input.close();	
			
		}
		
		
		
	}
	
	
	public static void main(String[] args){
		
		PMIKusaidianaAPP app = new PMIKusaidianaAPP();
		
		Scanner input = new Scanner(System.in);
				
		displayMenu(Menu.mainMenu);		
		
		int selectedOption = input.nextInt();
	
	switch(selectedOption){
		
		case 1:
			displayMenu(Menu.memberMgmtMenu);
			int memberMgmtSwitch = input.nextInt();
			app.memberServiceSwitch(memberMgmtSwitch);
			break;
		
		default:
			System.out.printf("%n I'm Still Working on that Module%n");
			input.close();
		
		}
	
	}
}
