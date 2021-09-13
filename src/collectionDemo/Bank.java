package collectionDemo;

import java.util.Map;

public class Bank {
	// open account
		public Map<Long, Account> openAccount(Map<Long, Account> accountMap, Account account) {
			accountMap.put(account.accNo, account);
			return accountMap;
		}

		// show balance
		public void showBalance(Map<Long, Account> accountMap, long accNo) {
			int match =0;
			for (Map.Entry<Long, Account> entry : accountMap.entrySet()) {
				if (entry.getValue().accNo == accNo) {
					System.out.println("Account Number : " + entry.getValue().accNo);
					System.out.println("Account Name : " + entry.getValue().name);
					System.out.println("Account Balance : " + entry.getValue().balance);
					match++;
				}
			}
			if(match<=0){
					System.out.println("The account does not exist");
			}
		}

		// list all account
		public void listAllAccount(Map<Long, Account> accountMap) {
			// iterate over map
			for (Map.Entry<Long, Account> entry : accountMap.entrySet()) {
				System.out.println("------------------------");
				System.out.println("The account is " + entry.getKey());
				System.out.println("Account Number : " + entry.getValue().accNo);
				System.out.println("Account Name : " + entry.getValue().name);
				System.out.println("Account Balance : " + entry.getValue().balance);
				System.out.println("Account Email : " + entry.getValue().email);

			}
		}
		// deposit
		public Map<Long, Account> depositAmount(Map<Long, Account> accountMap, long accNo, double depositAmount) {
			int match =0;
			for (Map.Entry<Long, Account> entry : accountMap.entrySet()) {
				if (entry.getValue().accNo == accNo) {
					//old balance
					System.out.println("Old Balance : " + entry.getValue().balance);
					//deposit action
					entry.getValue().balance += depositAmount;
					
					System.out.println("Account Number : " + entry.getValue().accNo);
					System.out.println("Account Name : " + entry.getValue().name);
					System.out.println("New Balance : " + entry.getValue().balance);
					match++;
				}
			}
			if(match<=0){
				System.out.println("The account does not exist");
			}
			return accountMap;
		}
		// withdraw
		public Map<Long, Account> wihdrawAmount(Map<Long, Account> accountMap, long accNo, double withdrawAmount) {
			int match =0;
			for (Map.Entry<Long, Account> entry : accountMap.entrySet()) {
				if (entry.getValue().accNo == accNo) {
					//old balance
					System.out.println("Old Balance : " + entry.getValue().balance);
					//deposit action
					entry.getValue().balance -= withdrawAmount;
					
					System.out.println("Account Number : " + entry.getValue().accNo);
					System.out.println("Account Name : " + entry.getValue().name);
					System.out.println("New Balance : " + entry.getValue().balance);
					match++;
				}
			}
			if(match<=0){
				System.out.println("The account does not exist");
			}
			return accountMap;
		}
		
		
		// fix deposit

}
