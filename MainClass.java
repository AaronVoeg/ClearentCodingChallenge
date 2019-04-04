/*Project: ClearentCodingChallenge
 * File: MainClass.java
 * Written by: Aaron Voegtle
 * Date: 3 April 2019
 * Description: This file runs the program by creating people, wallets, and credit cards.
 * 				it runs the methods in each other class to fill the data fields and calculate
 * 				the interest amount for the person, wallet, and cards.
 * 
 * TODO : change personInterest() method call so that the variable has to be called not the method
 * 			check person class so that changes in the class are reflected in the class description
*/



package codingChallenge;


public class MainClass {
	
	// constants variables which hold the interest rates for each of the cards
	public static final double VISA = .1;
	public static final double MC = .05;
	public static final double DISCOVER = .01;
	//constant variable that holds the balance rate for the cards
	public static final double BALANCE = 100.00;
	
	public static void main(String[] args) {
		
		//creates the first person
		Person person1 = new Person();
		//adds the one wallet to the person
		person1.addWallet();
		//adds the three credit cards to the wallet 
		person1.pocket.get(0).addCard(VISA, BALANCE);
		person1.pocket.get(0).addCard(MC, BALANCE);
		person1.pocket.get(0).addCard(DISCOVER, BALANCE);
		//prints out to the console the interest amount for the person, wallet and cards
		System.out.println("person 1 wallet 1 Visa = "    + person1.pocket.get(0).cards.get(0).interestAmount);
		System.out.println("person 1 wallet 1 MC = "      + person1.pocket.get(0).cards.get(1).interestAmount);
		System.out.println("person 1 wallet 1 Discover = "+ person1.pocket.get(0).cards.get(2).interestAmount);
		System.out.println("person 1 wallet 1 = "+ person1.pocket.get(0).totalInterestForWallet);
		System.out.println("person 1 = " + person1.personInterest());
		
		System.out.println("");
		//repeats the process as stated above for a new person
		Person person2 = new Person();
		person2.addWallet();
		
		person2.pocket.get(0).addCard(VISA, BALANCE);
		person2.pocket.get(0).addCard(DISCOVER, BALANCE);
		
		person2.addWallet();
		person2.pocket.get(1).addCard(MC, BALANCE);
		
		System.out.println("person 2 wallet 1 Visa = "    + person2.pocket.get(0).cards.get(0).interestAmount);
		System.out.println("person 2 wallet 1 Discover = "+ person2.pocket.get(0).cards.get(1).interestAmount);
		System.out.println("person 2 wallet 2 MC = " + person2.pocket.get(1).cards.get(0).interestAmount);
		System.out.println("person 2 wallet 1 = "+ person2.pocket.get(0).totalInterestForWallet);
		System.out.println("person 2 wallet 2 = "+ person2.pocket.get(1).totalInterestForWallet);
		System.out.println("person 2 = " + person2.personInterest());
		
		System.out.println("");
		
		Person person3 = new Person();
		person3.addWallet();
		
		person3.pocket.get(0).addCard(MC, BALANCE);
		person3.pocket.get(0).addCard(VISA, BALANCE);
		
		Person person4 = new Person();
		person4.addWallet();
		
		person4.pocket.get(0).addCard(VISA, BALANCE);
		person4.pocket.get(0).addCard(MC, BALANCE);
		
		System.out.println("person 3 wallet 1 MC = "    + person3.pocket.get(0).cards.get(0).interestAmount);
		System.out.println("person 3 wallet 1 Visa = "+ person3.pocket.get(0).cards.get(1).interestAmount);
		System.out.println("person 3 wallet 1 = "+ person3.pocket.get(0).totalInterestForWallet);
		System.out.println("person 3 = " + person3.personInterest());
		
		System.out.println("");
		
		System.out.println("person 4 wallet 1 Visa = "    + person4.pocket.get(0).cards.get(0).interestAmount);
		System.out.println("person 4 wallet 1 MC = "+ person4.pocket.get(0).cards.get(1).interestAmount);
		System.out.println("person 4 wallet 1 = "+ person4.pocket.get(0).totalInterestForWallet);
		System.out.println("person 4 = " + person4.personInterest());
	}

}
