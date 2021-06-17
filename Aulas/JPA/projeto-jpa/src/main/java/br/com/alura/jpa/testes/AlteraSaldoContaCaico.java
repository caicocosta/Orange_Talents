package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraSaldoContaCaico {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta contadoCaico = em.find(Conta.class, 1L);		
		
		em.getTransaction().begin();
		
		contadoCaico.setSaldo(5000.00);
		
		em.getTransaction().commit();
	}

}
