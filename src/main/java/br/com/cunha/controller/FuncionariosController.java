package br.com.cunha.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.cunha.interfaces.RepoFuncionarioI;
import br.com.cunha.modelo.Funcionario;



@Controller
public class FuncionariosController {

	private static final Logger logger = LoggerFactory.getLogger(FuncionariosController.class);
	
	private RepoFuncionarioI repoFuncionarioI;
	private Result result;

	
	
	protected FuncionariosController() {
	}
	
	
	
	@Inject
	public FuncionariosController(RepoFuncionarioI repoFuncionarioI, Result result){
		this.repoFuncionarioI=repoFuncionarioI;
		this.result = result;
	}
	
	
	@Get @Path("/funcionarios")
	public void lista(){
		logger.info("Testando o comportamento do LOG.");
		Funcionario f = new Funcionario();
		f.setId(new Long(1));
		f.setNome("herculano");
		f.setMatricula("448383");
		
		result.use(Results.json()).from(f).serialize();
	}
	
	@Post @Path("/funcionario")
	public void salva(Funcionario funcionario){
		
	}
	
	
}
