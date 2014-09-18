
public class BankDemo extends Account {
	public static void main(String[] args){

		
		
	Account testing = new Account(1122, 20000, 4.5);
	
	testing.deposit(3000);
	System.out.println("Your Balance is : $" + testing.getbalance());
	System.out.println("Created on: "+ testing.getDateCreated());
	System.out.println("Your Monthly interest: $"+ testing.getMonthlyInterest());
	try{
	testing.withdraw(2500);
	System.out.println("Your balance after withdrawing $2500: "+ testing.getbalance());
	
	System.out.println("Trying to draw $23000 ");
	testing.withdraw(23000);
	}
	catch (InsufficientFundsException e){
		System.out.println("Sorry but you are short : $"+ e.getAmount());
		e.printStackTrace();
	}
	}
	
}
