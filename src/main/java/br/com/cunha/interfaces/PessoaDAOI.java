package br.com.cunha.interfaces;

import java.util.List;

import br.com.cunha.modelo.Pessoa;

public interface PessoaDAOI {
	
	void gravarPessoa(Pessoa pessoa);
	List<Pessoa> listarPessoas();
}
