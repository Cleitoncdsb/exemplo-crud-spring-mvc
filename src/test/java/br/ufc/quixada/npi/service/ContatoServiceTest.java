package br.ufc.quixada.npi.service;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufc.quixada.npi.model.Contato;

public class ContatoServiceTest {
	
	protected ContatoService contatoService;
	
	@Test
	public void testSalvar() {
		Contato contato = new Contato();
		contato.setNome("José");
		contato.setSobreNome("Silva");
		contato.setFone("55 5555 5555");
		contato.setCidade("São Paulo");
		contato.setEndereco("Rua 2, 100");
		contato.setEmail("josesilva@gmail.com");
		this.contatoService.salvar(contato);
	}

	@Test
	public void testAtualizar() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
