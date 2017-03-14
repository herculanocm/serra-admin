package br.com.cunha.interfaces;

import java.util.List;

import br.com.cunha.modelo.Pessoa;

public interface RepoPessoaI {
	void salvarPessoa(Pessoa pessoa);
	List<Pessoa> listarPessoas();
}
