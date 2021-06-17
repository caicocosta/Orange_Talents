package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;

public class TesteClienteConta {
    public static void main(String[] args) {
		
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
    	EntityManager em = emf.createEntityManager(); 	
    	    	
    	Cliente cliente = new Cliente();
    	cliente.setNome("CAICO SALES O COSTA");
    	cliente.setProfissao("DEVELOPER");
    	cliente.setEndereco("TESTE");
    	
    	Conta conta = new Conta();
    	conta = em.find(Conta.class, 1L);
    	conta.setCliente(cliente);

    	em.getTransaction().begin();
    	
    	em.persist(cliente);
    	em.merge(conta);
    	
    	em.getTransaction().commit();
    	em.close();
    	
	}
}
