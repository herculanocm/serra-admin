package br.com.cunha.modelo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.joda.time.LocalDate;

import br.com.cunha.Endereco;
import br.com.cunha.Fone;
import br.com.cunha.Pessoa;


public class Funcionario extends Pessoa{
	
	private LocalDate dtAdmissao;
	private LocalDate dtDemisao;
	private FuncaoFuncionario funcaoFuncionario;
	private boolean flgAtivo;
	private String matricula;
	
	public Funcionario(){
		
	};
	
	public Funcionario(LocalDate dtAdmissao, LocalDate dtDemisao, FuncaoFuncionario funcaoFuncionario, boolean flgAtivo,
			String matricula) {
		super();
		this.dtAdmissao = dtAdmissao;
		this.dtDemisao = dtDemisao;
		this.funcaoFuncionario = funcaoFuncionario;
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

	public FuncaoFuncionario getFuncaoFuncionario() {
		return funcaoFuncionario;
	}

	public void setFuncaoFuncionario(FuncaoFuncionario funcaoFuncionario) {
		this.funcaoFuncionario = funcaoFuncionario;
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
		return "Funcionario [dtAdmissao=" + dtAdmissao + ", dtDemisao=" + dtDemisao + ", funcaoFuncionario="
				+ funcaoFuncionario + ", flgAtivo=" + flgAtivo + ", matricula=" + matricula + "]";
	}
	
	
	
	
	

}
