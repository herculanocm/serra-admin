package br.com.cunha.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.cunha.interfaces.FuncionarioDAOI;
import br.com.cunha.modelo.Funcionario;

public class FuncionarioDAO implements FuncionarioDAOI {
	
	private final EntityManager manager;
	
	@Inject
	public FuncionarioDAO(EntityManager manager){
		this.manager = manager;
	}

	@Override
	public void addFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Funcionario> allFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
