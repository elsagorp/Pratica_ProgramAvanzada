package Pratica4.Tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Pratica4.HotelRestPool;

import static org.junit.Assert.assertEquals;


class HotelRestPoolTest {
	HotelRestPool h = new HotelRestPool("Vipen","Gijin street", "Berlin", 145,2, true ,true,true, 55, false, "Skykitchen","Traditional german food",20,1,40,true,10,20);
	@Test
	final void test() {
		assertEquals(false, h.isRestaurTerrace());
		assertEquals("Skykitchen", h.getName());
		assertEquals("Traditional german food", h.getTypeFood());
		assertEquals(20, h.getNumTable());
		assertEquals(1, h.getNumStars());
		assertEquals(40, h.getMaxCapacity());
		assertEquals(true, h.isOutpool());
		assertEquals(10, h.getNumHamm());
		assertEquals(20, h.getMaxCapacityPool());
	}
	
	@Test
	void testTypePool() {
		assertEquals("This hotel have outdoor pool", h.typePool());
	}
	
	@Test
	void testTypeRestaur() {
		assertEquals("This restaurant dont have terrace", h.typeRestaur());
	}
}
