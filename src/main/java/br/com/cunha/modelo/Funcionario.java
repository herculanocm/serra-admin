package br.com.cunha.modelo;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.joda.time.LocalDate;

@Entity(name="funcionario")
@Table(name="funcionario")
@PrimaryKeyJoinColumn(name="PESSOA_ID")
public class Funcionario extends Pessoa{
	
	private LocalDate dtAdmissao;
	private LocalDate dtDemisao;
	//private FuncaoFuncionario funcaoFuncionario;
	private boolean flgAtivo;
	private String matricula;
	
	public Funcionario(){
	};
	
	public Funcionario(LocalDate dtAdmissao, LocalDate dtDemisao,  boolean flgAtivo,
			String matricula) {
		super();
		this.dtAdmissao = dtAdmissao;
		this.dtDemisao = dtDemisao;
		
		this.flgAtivo = flgAtivo;
		this.matricula = matricula;
	}

	public LocalDate getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(LocalDate dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public LocalDate getDtDemisao() {
		return dtDemisao;
	}

	public void setDtDemisao(LocalDate dtDemisao) {
		this.dtDemisao = dtDemisao;
	}

	

	public boolean isFlgAtivo() {
		return flgAtivo;
	}

	public void setFlgAtivo(boolean flgAtivo) {
		this.flgAtivo = flgAtivo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Funcionario [dtAdmissao=" + dtAdmissao + ", dtDemisao=" + dtDemisao +  ", flgAtivo=" + flgAtivo + ", matricula=" + matricula + "]";
	}
	
	
	
	
	

}
