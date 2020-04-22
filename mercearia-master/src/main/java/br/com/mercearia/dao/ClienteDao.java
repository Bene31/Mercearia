package br.com.mercearia.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mercearia.model.Cliente;

public class ClienteDao {
	
	// Gerenciamento e acesso ao banco de dados
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit_app");	
	private EntityManager em = factory.createEntityManager();    
	
	public Cliente inserirCliente(Cliente cliente) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.persist(cliente);
			
			em.getTransaction().commit();
			return cliente;
		} catch (Exception e) {
			em.getTransaction().rollback();
		    throw new Exception(e);
		}
  }
	
	public List<Cliente> recuperarTodosCliente() {
		List<Cliente> cliente = new ArrayList<>();	
		try {
			cliente = em.createQuery("Select p from " + Cliente.class.getSimpleName() + " p").getResultList();			
		} catch (Exception e) {			
		   System.out.println(e.getMessage());		   
		}
		return cliente;
  }
	
	
	/*Query query = entityManager			  
				.createQuery(
						"Select u from Usuario u where u.nomeUsuario = :name and u.senha = :senha",
						Usuario.class);
		query.setParameter("name", nomeUsuario);
		query.setParameter("senha", senha);
		usuario = (Usuario) query.getSingleResult();
		return usuario;*/

}
