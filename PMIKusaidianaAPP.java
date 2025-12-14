import java.util.Scanner;

class PMIKusaidianaAPP {
	
	public static void displayMenu(String menu){
		System.out.println();
		System.out.println(menu);
		System.out.println();
		System.out.printf("%nChoose option: ");
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String menu = """
			==== WELCOME TO PMI KUSAIDIANA SYSTEM ====
			
			1. Manage Members
			2. Record Contribution
			3. Record Event Support
			4. View Reports
			5. Exit
			""";
		
		displayMenu(menu);		
		
		int selectedOption = input.nextInt();
	
	switch(selectedOption){
		
		case 1:
			System.out.printf("%nYou Selected Member Management%n");
			break;
		
		default:
			System.out.printf("%n I'm Still Working on that Module%n");		
		
		}
	
	}
}
