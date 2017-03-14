package br.com.cunha.modelo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

import org.joda.time.LocalDate;


@Entity
@Table(name="pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
	
	
	private Long id;
	private String nome;
	private String fantasia;
	
	private Long cgc;
	private LocalDate dtNascimento;
	private LocalDate dtInclusao;
	private String usuarioInclusao;
	
	
	private Set<Endereco> enderecos = new HashSet<Endereco>();
	private Set<Fone> fone = new HashSet<Fone>();
	
	
	public Pessoa(){
		
	};
	

	public Pessoa(Long id, String nome, String fantasia, Long cgc, LocalDate dtNascimento,
			LocalDate dtInclusao, String usuarioInclusao, Set<Endereco> enderecos, Set<Fone> fone) {
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


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PESSOA_ID", unique = true, nullable = false)
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
	
	@Column(name = "PESSOA_CGC", unique = true, nullable = false)
	public Long getCgc() {
		return cgc;
	}

	public void setCgc(Long cgc) {
		this.cgc = cgc;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa") 
	public Set<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Set<Fone> getFone() {
		return fone;
	}

	public void setFone(Set<Fone> fone) {
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
