import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EncryptionTest {
	Encryption code = new Encryption();

	@Test
	public void testOne() {
		String input = "haveaniceday";
		String expected = "hae and via ecy ";
		String result = code.solve(input);

		assertThat(result, is(expected));
	}

	@Test
	public void testTwo() {
		String input = "feedthedog";
		String expected = "fto ehg ee dd ";
		String result = code.solve(input);

		assertThat(result, is(expected));
	}
	
	@Test
	public void testThree() {
		String input = "chillout";
		String expected = "clu hlt io ";
		String result = code.solve(input);

		assertThat(result, is(expected));
	}
}