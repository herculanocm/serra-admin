package br.com.cunha.interfaces;

import java.util.List;

import br.com.cunha.modelo.Funcionario;

public interface FuncionarioDAOI {
	
	void addFuncionario(Funcionario funcionario);
	List<Funcionario> allFuncionarios();

}
