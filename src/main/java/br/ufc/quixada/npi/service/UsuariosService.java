package br.ufc.quixada.npi.service;

import java.util.List;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Usuario;

public interface UsuariosService {

	public abstract void salvar(Usuario usuario);

	public Usuario findById(int id);

	public abstract List<Usuario> findAll();
	
	

}