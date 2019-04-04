/*Project: ClearentCodingChallenge
 * File: Person.java
 * Written by: Aaron Voegtle
 * Date: 3 April 2019
 * Description: Class that holds the constructors for person, creates new wallet objects and calculates
 * 				the interest for the specific person
 * 
 * TODO : change personInterest() method call so that the variable has to be called not the method
*/


package codingChallenge;

import java.util.ArrayList;

public class Person {
	//creates an dynamic array list so that more wallets can be added at any time
	ArrayList<Wallet> pocket = new ArrayList<Wallet>();
	double totalInterestForPerson;
	
	// constructor, creates a new array list called pocket and variable 
	//that hold the total interest for the person
	Person(){		
		this.pocket = new ArrayList<Wallet>();
		//this.totalInterestForPerson = totalInterestForPerson;		
	}
	
	//TODO personInterest() only runs this once and never again
	
	//method that adds a new wallet to the pocket arraylist 
	//and immediately calculates the total interest for the person
	public void addWallet() {
		Wallet newWallet = new Wallet();
		pocket.add(newWallet);
		totalInterestForPerson = personInterest();
	}
	
	//finds the interest for the person by looping through their wallets and adding the 
	//interest from each card together
	public double personInterest() {
		double interestForPerson = 0;
		
		for (int i = 0; i < pocket.size();i++) {
			interestForPerson = interestForPerson + pocket.get(i).totalInterestForWallet;
		}
		
		
		return interestForPerson;
	}

}
