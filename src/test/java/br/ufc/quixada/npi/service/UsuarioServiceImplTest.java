package br.ufc.quixada.npi.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Usuario;

public class UsuarioServiceImplTest {

	@Autowired
	protected UsuarioService usuarioService;
	

	@Test
	@Transactional
	public void testSalvar() {
		List<Usuario> usuarios1 = this.usuarioService.findAll();
		List<Usuario> usuarios2 = this.usuarioService.findAll();
		assertEquals(usuarios1, usuarios2);
	}

	@Test
	@Transactional
	public void testFindById() {

	}

	@Test
	@Transactional
	public void testFindAll() {
		
	}

}
