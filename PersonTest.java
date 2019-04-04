package codingChallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {

		Person person1 = new Person();
		assertThrows(IndexOutOfBoundsException.class, () -> person1.pocket.get(0));
	}

	@Test
	void testAddWallet() {
		Person person3 = new Person();
		person3.addWallet();
		person3.pocket.get(0).addCard(.1, 100);
		
		assertEquals(10,person3.personInterest());
	}

	@Test
	void testPersonInterest() {
		
		Person person2 = new Person();
		person2.addWallet();
		person2.pocket.get(0).addCard(.1, 100);
		
		assertEquals(10, person2.personInterest());
	}

}
