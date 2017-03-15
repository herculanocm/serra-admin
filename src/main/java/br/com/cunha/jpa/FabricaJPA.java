package br.com.cunha.jpa;


import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class FabricaJPA {
	
	
@PersistenceContext
private EntityManager manager;

@Produces
public EntityManager getManager(){
	return manager;
}
	
}
