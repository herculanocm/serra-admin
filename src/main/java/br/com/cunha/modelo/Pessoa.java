package br.com.cunha.modelo;

import java.math.BigInteger;
import java.util.List;

import org.joda.time.LocalDate;

public class Pessoa {
	
	private BigInteger id;
	private String nome;
	private String fantasia;
	private BigInteger cgc;
	private LocalDate dtNascimento;  
	private List<Endereco> enderecos;
	private List<Fone> fone;
	
	
	public Pessoa(){
		
	};
	
	public Pessoa(BigInteger id, String nome, String fantasia, BigInteger cgc, LocalDate dtNascimento,
			List<Endereco> enderecos, List<Fone> fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.fantasia = fantasia;
		this.cgc = cgc;
		this.dtNascimento = dtNascimento;
		this.enderecos = enderecos;
		this.fone = fone;
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

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public BigInteger getCgc() {
		return cgc;
	}

	public void setCgc(BigInteger cgc) {
		this.cgc = cgc;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Fone> getFone() {
		return fone;
	}

	public void setFone(List<Fone> fone) {
		this.fone = fone;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", fantasia=" + fantasia + ", cgc=" + cgc + ", dtNascimento="
				+ dtNascimento + ", enderecos=" + enderecos + ", fone=" + fone + "]";
	}
	
	
	

}
