package br.com.cunha;

import java.math.BigInteger;
import java.util.List;

import org.joda.time.LocalDate;

public class Pessoa {
	
	private Long id;
	private String nome;
	private String fantasia;
	private BigInteger cgc;
	private LocalDate dtNascimento;
	private LocalDate dtInclusao;
	private String usuarioInclusao;
	private List<Endereco> enderecos;
	private List<Fone> fone;
	
	
	public Pessoa(){
		
	};
	





	public Pessoa(Long id, String nome, String fantasia, BigInteger cgc, LocalDate dtNascimento,
			LocalDate dtInclusao, String usuarioInclusao, List<Endereco> enderecos, List<Fone> fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.fantasia = fantasia;
		this.cgc = cgc;
		this.dtNascimento = dtNascimento;
		this.dtInclusao = dtInclusao;
		this.usuarioInclusao = usuarioInclusao;
		this.enderecos = enderecos;
		this.fone = fone;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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


	public LocalDate getDtInclusao() {
		return dtInclusao;
	}



	public void setDtInclusao(LocalDate dtInclusao) {
		this.dtInclusao = dtInclusao;
	}



	public String getUsuarioInclusao() {
		return usuarioInclusao;
	}



	public void setUsuarioInclusao(String usuarioInclusao) {
		this.usuarioInclusao = usuarioInclusao;
	}


	

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", fantasia=" + fantasia + ", cgc=" + cgc + ", dtNascimento="
				+ dtNascimento + ", dtInclusao=" + dtInclusao + ", usuarioInclusao=" + usuarioInclusao + ", enderecos="
				+ enderecos + ", fone=" + fone + "]";
	}

	

}
