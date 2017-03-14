package br.com.cunha;

import java.math.BigInteger;

public class Fone {
	
	private Long numero;
	private String descricao;
	private String tipo;
	private BigInteger ramal;
	private boolean flgPrincipal;
	
	public Fone(){
		
	}

	public Fone(Long numero, String descricao, String tipo, boolean flgPrincipal, BigInteger ramal) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.tipo = tipo;
		this.flgPrincipal = flgPrincipal;
		this.ramal=ramal;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
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

	public boolean getFlgPrincipal() {
		return flgPrincipal;
	}

	public void setFlgPrincipal(boolean flgPrincipal) {
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
