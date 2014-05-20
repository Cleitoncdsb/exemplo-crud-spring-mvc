package br.ufc.quixada.npi.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Contato;

public abstract class ContatoServiceTest {
	
	@Autowired
	protected ContatoService contatoService;
	
	@Test
	@Transactional
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
	@Transactional
	public void testAtualizar() throws Exception {
		Contato novo = this.contatoService.findById(1);
		String velho = novo.getNome();
		novo.setNome(velho + "Modf");
		this.contatoService.salvar(novo);
		novo = this.contatoService.findById(1);
		assertEquals(velho + "Modf", novo.getNome());
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
