/*Project: ClearentCodingChallenge
 * File: CreditCard.java
 * Written by: Aaron Voegtle
 * Date: 3 April 2019
 * Description: Class that holds the constructors for CreditCard, calculates the interest for 
 * the individual credit card
 * 
 */


package codingChallenge;

public class CreditCard extends Wallet{
	double interestRate;
	double balance;
	double interestAmount;
	
	
	CreditCard(){
		
	}
	// constructor that builds the credit cards, using interest rate and balance and 
	// immediately calculates the interest for the the card
	CreditCard(double interestRate, double balance){
		this.interestRate = interestRate;
		this.balance = balance;
		this.interestAmount = interest(interestRate, balance);
	}
	
			
	//method that calculates the interest for the card	
	public double interest(double interestRate, double balance) {
		double interestAmmount;
		interestAmmount = interestRate * balance;
		return interestAmmount;
	}

}
