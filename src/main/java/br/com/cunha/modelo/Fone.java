package br.com.cunha.modelo;

import java.math.BigInteger;

public class Fone {
	
	private BigInteger numero;
	private String descricao;
	private String tipo;
	private BigInteger ramal;
	private String flgPrincipal;
	
	public Fone(){
		
	}

	public Fone(BigInteger numero, String descricao, String tipo, String flgPrincipal, BigInteger ramal) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.tipo = tipo;
		this.flgPrincipal = flgPrincipal;
		this.ramal=ramal;
	}

	public BigInteger getNumero() {
		return numero;
	}

	public void setNumero(BigInteger numero) {
		this.numero = numero;
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
	
	

	public BigInteger getRamal() {
		return ramal;
	}

	public void setRamal(BigInteger ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		return "Fone [numero=" + numero + ", descricao=" + descricao + ", tipo=" + tipo +  ", ramal=" + ramal +", flgPrincipal="
				+ flgPrincipal + "]";
	};
	
	

}
