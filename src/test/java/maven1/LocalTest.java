package maven1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LocalTest {
	@Test
	void testName() throws Exception {
		Calc calc = new Calc();
		assertEquals(2, calc.add(1, 1));
//		assertEquals(3, 1+1);
	}
}
