import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bank;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class TestBank3 {
	Bank account1 = new Bank(6789, "Chase", "Lansdale", 5.86);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		account1.deposit(20.00);
	}

	@Test
	public void test() {
		assertEquals(25.86, account1.getBalance(), 0.0);
	}

}
