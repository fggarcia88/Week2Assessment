import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bank;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class TestBank4 {
	Bank account1 = new Bank(9512, "Jason", "Gonong", 100.20);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		account1.withdraw(150.00);
	}

	@Test
	public void test() {
		assertTrue(account1.checkOverdraw());
	}

}
