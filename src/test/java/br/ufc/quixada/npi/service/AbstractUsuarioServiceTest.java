package br.ufc.quixada.npi.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Usuario;


public abstract class AbstractUsuarioServiceTest {

	@Autowired
	protected UsuarioService usuarioService;
	

	@Test
	@Transactional
	public void testSalvar() {
		Usuario usuario1 = this.usuarioService.findById(1);
		Usuario usuario2 = new Usuario();
		usuario2.setHabilitado(true);
		usuario2.setLogin("claudio");
		usuario2.setSenha("123");
		this.usuarioService.salvar(usuario2);
		Assert.assertNotSame("Usuario Id deveria ter sido gerado automaticamente", usuario1, usuario2);	;
	}

	@Test
	@Transactional
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	@Transactional
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
