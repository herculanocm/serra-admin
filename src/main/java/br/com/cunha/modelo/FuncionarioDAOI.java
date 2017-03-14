package br.com.cunha.modelo;

import java.util.List;

public interface FuncionarioDAOI {
	
	void addFuncionario(Funcionario funcionario);
	List<Funcionario> allFuncionarios();

}
