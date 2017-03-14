package br.com.cunha.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.cunha.interfaces.RepoFuncionarioI;

@Controller
public class FuncionariosController {

	private final RepoFuncionarioI repoFuncionarioI;

	
	
	@Inject
	public FuncionariosController(RepoFuncionarioI repoFuncionarioI){
		this.repoFuncionarioI=repoFuncionarioI;
	}
	
	
	
	
}
