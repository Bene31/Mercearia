package br.com.mercearia.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mercearia.model.MonitEnt;

public class MonitEntDao {
	
	// Gerenciamento e acesso ao banco de dados
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit_app");	
	private EntityManager em = factory.createEntityManager();    
	
	public MonitEnt inserirMonitEnt(MonitEnt monitEnt) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.persist(monitEnt);
			
			em.getTransaction().commit();
			return monitEnt;
		} catch (Exception e) {
			em.getTransaction().rollback();
		    throw new Exception(e);
		}
  }
	
	public List<MonitEnt> recuperarTodosMonitEnts() throws Exception {		
		try {
			List<MonitEnt> monitEnts = new ArrayList<>();
			em.getTransaction().begin();
			
			monitEnts = em.createQuery("Select p from " + MonitEnt.class.getSimpleName() + " p").getResultList();
			
			return monitEnts;
		} catch (Exception e) {			
		    throw new Exception(e);
		}
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
