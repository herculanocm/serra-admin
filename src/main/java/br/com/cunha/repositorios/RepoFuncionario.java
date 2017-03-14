package br.com.cunha.repositorios;

import java.util.List;

import javax.inject.Inject;

import br.com.cunha.interfaces.FuncionarioDAOI;
import br.com.cunha.interfaces.RepoFuncionarioI;
import br.com.cunha.modelo.Funcionario;

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
