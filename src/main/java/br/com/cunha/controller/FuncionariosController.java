package br.com.cunha.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.cunha.interfaces.RepoFuncionarioI;

@Controller
public class FuncionariosController {

	private RepoFuncionarioI repoFuncionarioI;
	private Result result;

	
	
	protected FuncionariosController() {
	}
	
	
	
	@Inject
	public FuncionariosController(RepoFuncionarioI repoFuncionarioI, Result result){
		this.repoFuncionarioI=repoFuncionarioI;
		this.result = result;
	}
	
	@Get("/funcionarios")
	public void getFuncionarios(){
		result.include("realizado com sucesso");
	}
	
	
}
