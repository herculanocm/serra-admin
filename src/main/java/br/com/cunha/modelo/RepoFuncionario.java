package br.com.cunha.modelo;

import java.util.List;

import javax.inject.Inject;

public class RepoFuncionario implements RepoFuncionarioI{
	
	private final FuncionarioDAOI funcionarioDAOI;
	
	@Inject
	public RepoFuncionario(FuncionarioDAOI funcionarioDAOI){
		this.funcionarioDAOI= funcionarioDAOI;
	}

	@Override
	public void salvaFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Funcionario> todosFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
