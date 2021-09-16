package collectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BankOperations {
public static void main(String[] args) {
		
		//create account objects
		Account account1 = new Account(10001, "John Snow", 987623.23, "john.snow@gmail.com");
		Account account2 = new Account(10002, "Arya Stark", 197623.23, "arya.stark@gmail.com");
		Account account3 = new Account(10003, "Ava Smith", 187623.23, "ava.smith@gmail.com");
		Account account4 = new Account(10004, "David Miller", 777623.23, "david.smillernow@gmail.com");
		Account account5 = new Account(10005, "Marry James", 66623.23, "marry.james@gmail.com");
		//account map
		Map<Long, Account> accountMap  = new LinkedHashMap<Long,Account>();
		//default accounts
		accountMap.put(10001L, account1);
		accountMap.put(10002L, account2);
		accountMap.put(10003L, account3);
		accountMap.put(10004L, account4);
		accountMap.put(10005L, account5);
		
		// System.out.println(accountMap);
		//create bank object
		Bank bank = new Bank();
		
	
	
		int c=1;

		while(c>=1) {
			System.out.println("-----------------------------------------");
			System.out.println("    :: Welcome to Iron Bank :: ");
			System.out.println("-----------------------------------------");
			System.out.println("1)Open Account \n2)Show Balance \n3)Deposit \n4)Close Account \n5)Print All Account \n6)Wihdraw");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter a account number : ");
				long accNo = input.nextLong();
				System.out.println("Enter a account name : ");
				String name = input.next();
				System.out.println("Enter a account balance : ");
				double balance = input.nextDouble();
				System.out.println("Enter a account email : ");
				String email = input.next();
				//open account
				accountMap = bank.openAccount(accountMap, new Account(accNo,name,balance,email));
				break;
			case 2:
				System.out.println("Enter a account number : ");
				long acccNo = input.nextLong();
				bank.showBalance(accountMap, acccNo);
				break;
			case 3:
				System.out.println("Enter a account number : ");
				long accNo1 = input.nextLong();
				System.out.println("Enter a deposit number : ");
				long depositAmt = input.nextLong();
				accountMap = bank.depositAmount(accountMap, accNo1, depositAmt);
				break;
			case 4:
				System.out.println("Not yet impleement");
				break;
			case 5:
				bank.listAllAccount(accountMap);
				break;
			case 6:System.out.println("Enter a account number : ");
			       long accNo2 = input.nextLong();
			      System.out.println("Enter a Withdraw  number : ");
			      long withdrawAmt = input.nextLong();
			      accountMap = bank.wihdrawAmount(accountMap, accNo2, withdrawAmt);
			      break;
			default:
				break;
			}
			System.out.println("Do you want to continue 1-yes 0-no");
			    c=input.nextInt();
			    
			
			
		} 
		
		

	}
	
	

}
