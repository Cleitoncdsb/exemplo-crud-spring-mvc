package br.ufc.quixada.npi.repository.jpa;

import javax.inject.Named;

import br.ufc.quixada.npi.model.Usuario;
import br.ufc.quixada.npi.repository.UsuarioRepository;

@Named
public class JpaUsuarioRepositoryImpl extends JpaGenericRepositoryImpl<Usuario>
		implements UsuarioRepository {

	public JpaUsuarioRepositoryImpl() {
		super();
		this.persistentClass = Usuario.class;
	}
}
