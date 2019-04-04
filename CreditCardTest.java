package codingChallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditCardTest {
	
	@Test
	void testConstructor() {
		//test for constructor with provided interest rates and balances
		CreditCard newCard2 = new CreditCard(.1,100);
		
		assertEquals(.1, newCard2.interestRate);
		assertEquals(100, newCard2.balance);
		assertEquals(10, newCard2.interestAmount);
		System.out.println("Visa is good");
		
		CreditCard newCard3 = new CreditCard(.05,100);
		
		assertEquals(.05, newCard3.interestRate);
		assertEquals(100, newCard3.balance);
		assertEquals(5, newCard3.interestAmount);
		System.out.println("MC is good");
		
		CreditCard newCard4 = new CreditCard(.01,100);
		
		assertEquals(.01, newCard4.interestRate);
		assertEquals(100, newCard4.balance);
		assertEquals(1, newCard4.interestAmount);
		System.out.println("Discover is good");
	}

	@Test
	void testInterest() {
		CreditCard newCard1 = new CreditCard();
		
		assertEquals(10,newCard1.interest(.1,100));
		assertEquals(5,newCard1.interest(.05,100));
		assertEquals(1,newCard1.interest(.01,100));
	}
	
	

}
