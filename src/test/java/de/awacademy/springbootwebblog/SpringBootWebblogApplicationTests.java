package de.awacademy.springbootwebblog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SpringBootWebblogApplicationTests {
	
	@Test
	public void simpleTest() {
		int a=1;
		assertEquals(1, a);

	}
	
	@Test
	public void simpleTestTrue() {
		assertTrue(true);
	}
}
