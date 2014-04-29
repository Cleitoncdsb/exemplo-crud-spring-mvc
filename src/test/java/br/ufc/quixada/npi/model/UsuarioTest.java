package br.ufc.quixada.npi.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.springframework.transaction.annotation.Transactional;

public class UsuarioTest {

	@Test
	@Transactional
	public void testIsHabilitado() {
		Usuario usuario = new Usuario();
		usuario.setHabilitado(true);
		assertNotNull(usuario);
		assertTrue(true);
	}

	@Test
	@Transactional
	public void testSetHabilitado() {
		Usuario usuario1 = new Usuario();
		usuario1.setHabilitado(true);
		Usuario usuario2 = usuario1;
		assertEquals(usuario2, usuario1);
	}
	
	/*@Test
	@Transactional
	public void testHasPapel(){
		Usuario usuario = new Usuario();
				
	}*/

}
