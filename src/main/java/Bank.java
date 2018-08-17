import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//note - a more detailed project was built in bank-teller2

public class Bank {
	
	Map<String, BankAccount> accounts = new HashMap<>();

	public void add(BankAccount account) {
		accounts.put(account.getAccountNumber(), account);
		
	}

	public BankAccount findAccount(String accountNum) {
		return accounts.get(accountNum);
	}

	public Collection<BankAccount> getAllAccounts() {
		return accounts.values();
	}

}
