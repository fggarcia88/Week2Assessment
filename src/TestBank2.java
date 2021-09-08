import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bank;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class TestBank2 {
	Bank account1 = new Bank(2345, "Sarah", "Garcia", 5.00);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		account1.withdraw(3.00);
	}

	@Test
	public void test() {
		assertEquals(2.00, account1.getBalance(), 0.0);
	}

}
