package br.com.cunha.interfaces;

import java.util.List;

import br.com.cunha.modelo.Funcionario;

public interface RepoFuncionarioI {
	
	void salvaFuncionario(Funcionario funcionario);
	List<Funcionario> todosFuncionarios();

}
