package br.ufc.quixada.npi.repository.jpa;

import javax.inject.Named;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.repository.ContatoRepository;

@Named
public class JpaContatoRepositoryImpl extends JpaGenericRepositoryImpl<Contato>
		implements ContatoRepository {

	public JpaContatoRepositoryImpl() {
		super();
		this.persistentClass = Contato.class;
	}
}
