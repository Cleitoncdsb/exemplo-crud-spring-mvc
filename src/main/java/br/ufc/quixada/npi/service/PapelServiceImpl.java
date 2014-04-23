package br.ufc.quixada.npi.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Papel;
import br.ufc.quixada.npi.repository.PapelRepository;

@Named
public class PapelServiceImpl implements PapelService {

	@Inject
	private PapelRepository papelRepository;

	public PapelServiceImpl() {
	}

	@Transactional
	public void salvar(Papel papel) {
		papelRepository.save(papel);

	}
	
	@Transactional
	public Papel findById(int id) {
		return papelRepository.find(id);
		 
	}
	@Transactional
	public List<Papel> findAll() {
		List<Papel> l = papelRepository.find();
		return l;
	}

}
