package Pratica4.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pratica4.Hotel;

class HotelTest {
	Hotel h = new Hotel("Akagamishi","Ankatsu street", "Tokyo", 145,2, true ,false,false, 50);
	@Test
	final void test() {
		assertEquals(true, h.getFull());
        assertEquals("Akagamishi",h.getHotelName());
		assertEquals(2, h.getNumStars());
	}

}
