package br.ufc.quixada.npi.service;

import java.util.List;

import br.ufc.quixada.npi.model.Papel;

public interface PapelService {

	public abstract void salvar(Papel papel);

	public Papel findById(int id);

	public abstract List<Papel> findAll();

}