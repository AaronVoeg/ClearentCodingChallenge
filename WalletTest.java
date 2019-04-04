package codingChallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WalletTest {

	@Test
	void testWallet() {
		
		Wallet wallet1 = new Wallet();
		assertThrows(IndexOutOfBoundsException.class, () ->wallet1.cards.get(0));
		
	}

	@Test
	void testAddCard() {
		Wallet wallet3 = new Wallet();
		wallet3.addCard(.1, 100);
		
		assertEquals(10,wallet3.cards.get(0).interestAmount);
	}

	@Test
	void testWalletInterest() {
		Wallet wallet2 = new Wallet();
		CreditCard newCard = new CreditCard(.1,100);
		wallet2.cards.add(newCard);
		
		assertEquals(10,wallet2.walletInterest());
	}

}
