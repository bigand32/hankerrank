import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class ElectronicShopTest {
	private ElectronicShop solved = new ElectronicShop();

	@Test
	public void testOne() {
		int[] keyboards= {3,1};
		int[] drives= {5,1,8};
		int bucket=10;
		int result = solved.getMoneySpent(keyboards,drives,bucket);
		int expected = 9;
		assertThat(result, is(expected));
	}
	@Test
	public void testTwo() {
		int[] keyboards= {4};
		int[] drives= {5};
		int bucket=5;
		int result = solved.getMoneySpent(keyboards,drives,bucket);
		int expected = -1;
		assertThat(result, is(expected));
	}
}
