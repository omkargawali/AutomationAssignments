package assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment6 {

	public static void main(String[] args) {
		
		// Array List to store Credit & Debit Amount 

		List<Integer> debit = new ArrayList<Integer>();
		debit.add(2000);
		debit.add(15000);
		debit.add(200);
		debit.add(300);
		debit.add(3000);

		List<Integer> credit = new ArrayList<Integer>();
		credit.add(50000);
		credit.add(3000);
		credit.add(4000);

		// To Count credited & debited amount 
		
		int amountCredited = 0;
		int amountDebited = 0;

		for (int i = 0; i < credit.size(); i++) {
			amountCredited += credit.get(i);
		}

		for (int j = 0; j < debit.size(); j++) {
			amountDebited += debit.get(j);
		}
		
		
		// Total Number of Transactions
		
		int totalTransaction = credit.size() + debit.size();
		System.out.println("Total number of credit and debit transactions completed : " +totalTransaction);
		
		//Total amount credited and debited in account
		
		int totalAmount = amountCredited + amountDebited ;
		System.out.println("Total amount credited and debited in account : " +totalAmount);
	
		//Total amount remaining at the end in Bank Account
		
		int remainingAmount = totalAmount - amountDebited;
		System.out.println("Total amount remaining at the end in Bank Account : " +remainingAmount);
		
		//Stored credit & debit list into transaction list
		
		List<Integer> transactions = new ArrayList<Integer>();
		transactions.addAll(credit);
		transactions.addAll(debit);
		
		int countSuspicious = 0;
		
		for(int i=0; i<transactions.size(); i++)
		{	
			
			if(transactions.get(i)> 10000)
			{
				System.out.println("Suspicious credit/ debit Transaction with Amount : "+transactions.get(i));
				countSuspicious++ ;
			}
			else {
				System.out.println("Transaction below credit/debit Limit "+transactions.get(i));
			}
			
		}
		
		// Total number of suspicious transactions 
		
		System.out.println("Total number of suspicious transactions : "+countSuspicious);
		
	}

}
