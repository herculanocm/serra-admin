package br.com.cunha.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import br.com.cunha.interfaces.FuncionarioDAOI;
import br.com.cunha.modelo.Funcionario;

@Transactional
public class FuncionarioDAO implements FuncionarioDAOI {
	
	private final EntityManager manager;
	
	/**
	 * @deprecated CDI eyes only
	 */
	protected FuncionarioDAO() {
		this(null);
	}
	
	
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
