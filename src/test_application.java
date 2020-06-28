import java.util.*;

public class test_application {
	
	//test names
	final static String[] names = {
			"Jerry",
			"Abram",
			"Rafaela",
			"Brittany",
			"Deloise",
			"Eleanore",
			"Josh",
			"Jacinto",
			"Mayra",
			"Miesha",
			"Coleen",
			"Hugo",
			"Keneth",
			"Jenelle",
			"Pearlie",
			"Ricardo"                       
	};
	
	public static void main(String[] args) {
		startApplication();
	}
	
	private static void startApplication() {
		Scanner in = new Scanner(System.in);
		Accounts accounts = new Accounts();
		
		/* test list set up
		accounts.setAccountsList(initAccountsList());
		*/
		
		char choice = 'n';
		//start application
		do {
			printMenu();
			choice = in.nextLine().charAt(0);
			
			switch(choice) {
				case 'a':
					System.out.println("Adding account");
					System.out.println("Enter new account's name:");
					String newName = in.nextLine();
					//add account to accounts
					accounts.addAccount(newName);
					break;
				case 's':
					System.out.println("Searching name");
					System.out.println("Enter name to search: ");
					String searchName = in.nextLine();
					String outputMessage = "";
					
					if(accounts.nameExists(searchName)) {
						//name found
						outputMessage = accounts.searchAccountsListByName(searchName).toString();
					}
					else {
						//name doesn't exist in accountsList
						outputMessage = "Error. Name does not exist in accountsList";
					}
					System.out.println(outputMessage);
					break;
				case 'd':
					if(accounts.isEmpty()) {
						System.out.println("No accounts to display");
					}
					else {
						//if there are any accounts in the list
						System.out.println("Displaying accounts list");
						System.out.println(accounts.toString());
					}
					break;
				case 'q':
					System.out.println("Quitting the program...");
					break;
				default:
					System.out.println("Invalid selection. Please try again...");
			}

			
		}while(choice!='q');
		
	}
	
	/* to init a test accounts list
	private static LinkedList<Account> initAccountsList(){
		LinkedList<Account> initaccountsList = new LinkedList<Account>();
		
		for (int i = 0; i < names.length; i++) {
			Account newaccount = new Account(names[i], UUID.randomUUID());
			
			initaccountsList.add(newaccount);
		}
		
		return initaccountsList;
	}
	*/
	
	//views
	private static void printMenu() {
		System.out.println("Menu");
		System.out.println("-------------------------");
		System.out.println("\t(A)dd account");
		System.out.println("\t(S)earch for account");
		System.out.println("\t(D)isplay the accounts list");
		System.out.println("\t(Q)uit the program");
		System.out.println("-------------------------");
		System.out.println("Enter a selection: ");
	}
	
}
