
import java.io.*;
import java.util.Date;

public class Account
{
   private double balance;
   private int ID;
   private double AnnualInterestRate;
   private Date DateCreated;
   
   public Account()
   {
      this.ID = ID;		 }
   public Account(int ID, double balance, double AnnualInterestRate){
	   this.ID= ID;
	   this.balance= balance;
	   this.AnnualInterestRate=AnnualInterestRate;
	   this.DateCreated= DateCreated;
   }
   public int getID() {
	return ID;
   	}
   public void setID(int iD) {
	   ID = iD;
	}
   public double getAnnualInterestRate() {
	   return AnnualInterestRate;
   }
   public void setAnnualInterestRate(double annualInterestRate) {
	   AnnualInterestRate = annualInterestRate;
   }
   public double getbalance(){
	   return balance;
   }
   public void setBalance(double balance) {
	   this.balance = balance;
   }
   public double getMonthlyInterest(){
	   return(AnnualInterestRate/ 12);
   }
   public Date getDateCreated(){
	   return DateCreated;
   }
   public void deposit(double amount)
   {
      balance += amount;
   }
   public void withdraw(double amount) throws
                              InsufficientFundsException
   {
      if(amount <= balance)
      {
         balance -= amount;
      }
      else
      {
         double needs = amount - balance;
         throw new InsufficientFundsException(needs);
      }}}


 