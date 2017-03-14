package br.com.cunha.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {
	
	private Long id;
	private Pessoa pessoa;
	private String logradouro;
	private String cidade;
	private int numero;
	private String uf;
	private int cep;
	private String bairro;
	private String complemento1;
	private String complemento2;
	private String complemento3;
	private String descricao;
	private String tipo;
	private boolean flgPrincipal;
	
	
	public Endereco(){
		
	}
	
	public Endereco( Pessoa pessoa, String logradouro, String cidade, int numero, String uf, int cep,
			String bairro, String complemento1, String complemento2, String complemento3, String descricao, String tipo,
			boolean flgPrincipal) {
		super();
		this.pessoa = pessoa;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.numero = numero;
		this.uf = uf;
		this.cep = cep;
		this.bairro = bairro;
		this.complemento1 = complemento1;
		this.complemento2 = complemento2;
		this.complemento3 = complemento3;
		this.descricao = descricao;
		this.tipo = tipo;
		this.flgPrincipal = flgPrincipal;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ENDERECO_ID", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PESSOA_ID", nullable = false)
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento1() {
		return complemento1;
	}
	public void setComplemento1(String complemento1) {
		this.complemento1 = complemento1;
	}
	public String getComplemento2() {
		return complemento2;
	}
	public void setComplemento2(String complemento2) {
		this.complemento2 = complemento2;
	}
	public String getComplemento3() {
		return complemento3;
	}
	public void setComplemento3(String complemento3) {
		this.complemento3 = complemento3;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isFlgPrincipal() {
		return flgPrincipal;
	}
	public void setFlgPrincipal(boolean flgPrincipal) {
		this.flgPrincipal = flgPrincipal;
	}
	


	
}
