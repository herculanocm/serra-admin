package br.com.cunha.modelo;

import java.util.List;

public interface RepoFuncionarioI {
	
	void salvaFuncionario(Funcionario funcionario);
	List<Funcionario> todosFuncionarios();

}
