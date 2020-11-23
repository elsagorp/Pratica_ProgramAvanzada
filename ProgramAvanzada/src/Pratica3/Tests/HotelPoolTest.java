package Pratica3.Tests;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Pratica2.HotelPool;

class HotelPoolTest {
	HotelPool h = new HotelPool("Burj","Rafa street", "Dubai", 850,5, false ,true,false, true, 100, 120);
	
	@Test
	final void test() {
		assertEquals(true, h.isOutpool());
        assertEquals(100, h.getNumHamm());
		assertEquals(250, h.getMaxCapacityPool());

	}
	
	@Test
	void testTypePool() {
		assertEquals("This hotel have outdoor pool", h.typePool());
	}
	
	

}
