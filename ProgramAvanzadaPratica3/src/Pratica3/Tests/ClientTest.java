package Pratica3.Tests;
import Pratica3.Client;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {

	Client cl = new Client();
	


	@Test
	final void testGetNickname() {
		cl.setNickname("Phiro");
		assertEquals("Phiro", cl.getNickname());
	}


	@Test
	final void testGetName() {
		cl.setName("Elsa");
		assertEquals("Elsa", cl.getName());
	}

	@Test
	final void testGetSurname() {
		cl.setSurname("Gordillo");
		assertEquals("Gordillo", cl.getSurname());
	}



}
