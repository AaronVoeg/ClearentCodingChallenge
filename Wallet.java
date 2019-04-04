/*Project: ClearentCodingChallenge
 * File: Wallet.java
 * Written by: Aaron Voegtle
 * Date: 3 April 2019
 * Description: Class that holds the constructors for Wallet, creates new CreditCard objects and calculates
 * 				the interest for the wallet
 * 
 */

package codingChallenge;

import java.util.ArrayList;


public class Wallet extends Person{
	double totalInterestForWallet;
	
	ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
	
	// constructor, creates new array list for credit cards and total interest variable
	//that hold the total value of the interest for the wallet
	Wallet(){
		this.cards = new ArrayList<CreditCard>();
		this.totalInterestForWallet = totalInterestForWallet;
	}
	
	
	//add a new credit card to the wallet and imediatly calculates the total
	//interest for the wallet
	public void addCard(double interest, double balance) {
		CreditCard newCard = new CreditCard(interest, balance);
		cards.add(newCard);
		totalInterestForWallet = walletInterest();
	}
		
	//when called, iterates through all cards in the wallet and
	//sums the interest for all the cards in the wallet
	public double walletInterest() {
		double interestForWallet = 0;
		for (int i = 0; i < cards.size();i++) {
			interestForWallet = interestForWallet + cards.get(i).interestAmount;
		}
		return interestForWallet;
	}
}
