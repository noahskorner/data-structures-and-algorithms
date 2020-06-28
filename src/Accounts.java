import java.util.LinkedList;
import java.util.UUID;

public class Accounts {
	private LinkedList<Account> accountsList = new LinkedList<Account>();
	
	public void setAccountsList(LinkedList<Account> newAccountsList) {
		this.accountsList = newAccountsList;
	}
	
	public Account searchAccountsListByName(String searchName) {
		Account searchAccount = null;
		
		for(int i = 0; i < accountsList.size(); i++) {
			String AccountName = accountsList.get(i).getName();
			
			if(AccountName.equalsIgnoreCase(searchName)) {
				searchAccount = accountsList.get(i);
			}
		}
		
		return searchAccount;
	}
	
	public boolean nameExists(String name) {
		boolean bool = false;
		for(int i = 0; i < accountsList.size(); i++) {
			String listName = accountsList.get(i).getName();
			
			if(name.equalsIgnoreCase(listName)) {
				bool = true;
			}
		}
		
		return bool;
	}
	
	public boolean isEmpty() {
		boolean isEmpty = false;
		
		if(accountsList == null) {
			isEmpty = true;
		}
		
		return isEmpty;
	}
	
	public String toString() {
		String str = "";
		
		for (int i = 0; i < accountsList.size(); i++) {
			str += accountsList.get(i).toString();
			str += "\n";
		}
		
		return str;
	}
	
	public void addAccount(String name) {
		Orders placeholderOrders = new Orders();
		Account newAccount = new Account(UUID.randomUUID(), name, "","","","","", "", "", -1, placeholderOrders);
		
		//add Account to AccountsList
		if(accountsList == null) {
			accountsList.addFirst(newAccount);
		}
		else {
			accountsList.add(newAccount);
		}
	}
}
