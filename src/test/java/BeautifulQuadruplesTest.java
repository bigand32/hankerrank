import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BeautifulQuadruplesTest {

	private BeautifulQuadruples solved = new BeautifulQuadruples();

	@Test
	public void testOne() {
		int result = solved.solve(1, 2, 3, 4);
		int expected = 11;
		assertThat(result, is(expected));
	}
	@Test
	public void testTwo() {
		int result = solved.solve(50, 50, 50, 50);
		int expected = 287736;
		assertThat(result, is(expected));
	}
}
