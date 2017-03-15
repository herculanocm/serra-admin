package br.com.cunha.controller;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caelum.vraptor.view.Results;
import br.com.cunha.interfaces.RepoFuncionarioI;
import br.com.cunha.modelo.Funcionario;



@Controller
public class FuncionariosController {

	private static final Logger logger = LoggerFactory.getLogger(FuncionariosController.class);
	
	private RepoFuncionarioI repoFuncionarioI;
	private Validator validator;
	private Result result;

	
	
	protected FuncionariosController() {
	}
	
	
	
	@Inject
	public FuncionariosController(RepoFuncionarioI repoFuncionarioI, Result result, Validator validator){
		this.repoFuncionarioI=repoFuncionarioI;
		this.result = result;
		this.validator=validator;
	}
	
	
	
	
	@Get @Path("/funcionarios")
	public void lista(){
		logger.info("Listando Funcionarios - metodo get");
		/*
		Funcionario f = new Funcionario();
		f.setId(new Long(1));
		f.setNome("herculano");
		f.setMatricula("448383");
		*/
		List<Funcionario> listaFuncionario= repoFuncionarioI.todosFuncionarios();
		result.use(Results.json()).from(listaFuncionario).serialize();
	}
	
	@Consumes("application/json")
	@Post 
	@Path("/funcionario")
	public void salva(@Valid Funcionario funcionario){
		logger.info("Sanvando novo Funcionario - metodo post, dados toString: "+funcionario.toString());
		
		
	
		
	
		
	}
	
	
}
