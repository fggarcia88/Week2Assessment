import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bank;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class TestBank1 {
	Bank account1 = new Bank();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		account1.setAccountId(1234);
		account1.setBalance(5.00);
		account1.setfName("Fernando");
		account1.setlName("Garcia");
	}

	@Test
	public void test() {
		assertEquals(1234, account1.getAccountId());
		assertEquals(5.00, account1.getBalance(), 0.0);
		assertEquals("Fernando", account1.getfName());
		assertEquals("Garcia", account1.getlName());

	}

}
