package br.ufc.quixada.npi.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.repository.ContatoRepository;



@Named
public class ContatoServiceImpl implements ContatoService {

	@Inject
	private ContatoRepository contatoRepository;

	public ContatoServiceImpl() {
	}

	@Transactional
	public void salvar(Contato contato) {
		contatoRepository.save(contato);

	}
	
	@Transactional
	public void  atualizar(Contato contato) {
		contatoRepository.update(contato);

	}

	
	@Transactional
	public Contato findById(int id) {
		return contatoRepository.find(id);
		 
	}
	@Transactional
	public List<Contato> findAll() {
		List<Contato> l = contatoRepository.find();
		return l;
	}
	@Transactional
	public void delete(Contato contato) {
		contatoRepository.delete(contato);
		 
	}

	

}
