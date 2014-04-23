package br.ufc.quixada.npi.repository.jpa;

import javax.inject.Named;

import br.ufc.quixada.npi.model.Papel;
import br.ufc.quixada.npi.repository.PapelRepository;

@Named
public class JpaPapelRepositoryImpl extends JpaGenericRepositoryImpl<Papel>
		implements PapelRepository {

	public JpaPapelRepositoryImpl() {
		super();
		this.persistentClass = Papel.class;
	}
}
