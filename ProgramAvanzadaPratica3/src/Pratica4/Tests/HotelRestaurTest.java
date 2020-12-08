package Pratica4.Tests;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Pratica4.HotelRestaur;

public class HotelRestaurTest {
	HotelRestaur h = new HotelRestaur("Loran","Parliament street", "Canada", 100,1, true,false,true, 28, false, "Osaka", "Japanese food", 25, 4,90);

	@Test
	public void test() {
		assertEquals("Osaka", h.getName());
		assertEquals("Japanese", h.getTypeFood());
		assertEquals(25, h.getNumTable());
		assertEquals(4, h.getNumStars());
		assertEquals(90, h.getMaxCapacity());
	}
	
	@Test
	void testTypeRestaur() {
		assertEquals("This restaurant dont have terrace", h.typeRestaur());
	}
}
