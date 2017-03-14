package br.com.cunha.modelo;

import java.math.BigInteger;

public class FuncaoFuncionario {
	private BigInteger id;
	private String nome;
	
	public FuncaoFuncionario(){
		
	};
	
	public FuncaoFuncionario(BigInteger id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "FuncaoFuncionario [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
