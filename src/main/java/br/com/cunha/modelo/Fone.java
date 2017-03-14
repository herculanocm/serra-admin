package br.com.cunha.modelo;

import static javax.persistence.GenerationType.IDENTITY;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fone")
public class Fone {
	
	private Long id;
	private Pessoa pessoa;
	private Long numero;
	private String descricao;
	private String tipo;
	private Long ramal;
	private boolean flgPrincipal;
	
	
	public Fone(){
		
	}
	
	public Fone(Pessoa pessoa, Long numero, String descricao, String tipo, Long ramal, boolean flgPrincipal) {
		super();
		this.pessoa = pessoa;
		this.numero = numero;
		this.descricao = descricao;
		this.tipo = tipo;
		this.ramal = ramal;
		this.flgPrincipal = flgPrincipal;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "FONE_ID", unique = true, nullable = false)
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

	public Long getRamal() {
		return ramal;
	}

	public void setRamal(Long ramal) {
		this.ramal = ramal;
	}

	public boolean isFlgPrincipal() {
		return flgPrincipal;
	}

	public void setFlgPrincipal(boolean flgPrincipal) {
		this.flgPrincipal = flgPrincipal;
	}


	
	
}
