package br.ufc.quixada.npi.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContatoTest {

	@Test
	public void testSetNome() {
		Contato contato = new Contato();
		contato.setNome("nome");
		assertNotNull(contato);
		assertEquals(contato.getNome(), "nome");
	}

	@Test
	public void testSetFone() {
		Contato contato= new Contato();
		contato.setFone("55 5555 5555");
		assertNotNull(contato);
		assertEquals(contato.getFone(), "55 5555 5555");
	}
	
	@Test
	public void testSetEmail() {
		Contato contato = new Contato();
		contato.setEmail("email@qualquer.com");
		assertNotNull(contato);
		assertEquals(contato.getEmail(), "email@qualquer.com");
	}

}
