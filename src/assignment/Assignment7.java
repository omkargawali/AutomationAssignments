package assignment;

public class Assignment7 {

	public static void main(String[] args) {
		
		
		// Store Customer details 

		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		/*
		 * If the credit score is above 750, the loan is automatically approved. 
		 * If the credit score is between 650 and 750, additional checks are performed. 
		 * If the credit score is below 650, the loan is denied.
		 */
		
		//Additional checks are performed
		
		if(creditScore > 750)
		{
			System.out.println("The loan is automatically approved");
		}
		else if(creditScore >= 650 && creditScore <=750)
		{
			if(income >= 50000)
			{
				if(isEmployed)
				{
					if(debtToIncomeRatio < 40)
					{
						System.out.println("Loan is approved for "+customerName);
					}
					else
					{
						System.out.println("Loan is denied due to DTI ratio");
					}
				}
				else
				{
					System.out.println("Loan is denied due to unemployed");
				}
			}
			else
			{
				System.out.println("Loan is denied due to low income");
			}
			
		}
		else
		{
			System.out.println("Loan is denied due to credit score is below 650");
		}
		

	}

}
