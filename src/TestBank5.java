import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Bank;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class TestBank5 {
	Bank account1 = new Bank();

	/**
	 * @throws java.lang.Exception
	 */
	@Test
	public void test() {
		assertNull(account1.getfName());
	}

}
