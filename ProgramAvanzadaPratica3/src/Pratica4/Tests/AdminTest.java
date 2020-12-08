package Pratica4.Tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pratica4.Admin;

class AdminTest {
	Admin a1 = new Admin("ElsaGorP", "12345");
	
	@Test
	final void test() {
		assertEquals("ElsaGorP",a1.getUserName());
		assertEquals("12345",a1.getPassword());
	}

}
