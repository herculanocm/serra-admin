package br.com.cunha.modelo;

public class Endereco {
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
	private String flgPrincipal;
	
	public Endereco(){
		
	}

	public Endereco(String logradouro, String cidade, int numero, int cep, String bairro, String complemento1,
			String complemento2, String complemento3, String descricao, String tipo, String flgPrincipal, String uf) {
		super();
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.complemento1 = complemento1;
		this.complemento2 = complemento2;
		this.complemento3 = complemento3;
		this.descricao = descricao;
		this.tipo = tipo;
		this.flgPrincipal = flgPrincipal;
		this.uf= uf;
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

	public String getFlgPrincipal() {
		return flgPrincipal;
	}

	public void setFlgPrincipal(String flgPrincipal) {
		this.flgPrincipal = flgPrincipal;
	}
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cidade=" + cidade + ", numero=" + numero + ", cep=" + cep + ", bairro="
				+ bairro + ", complemento1=" + complemento1 + ", complemento2=" + complemento2 + ", complemento3="
				+ complemento3 + ", descricao=" + descricao + ", tipo=" + tipo + ", flgPrincipal=" + flgPrincipal + ", uf=" + uf + "]";
	};
	
	
	
	
	
}
