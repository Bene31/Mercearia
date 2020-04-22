package br.com.mercearia.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mercearia.model.MonitSai;

public class MonitSaiDao {
	
	// Gerenciamento e acesso ao banco de dados
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit_app");	
	private EntityManager em = factory.createEntityManager();    
	
	public MonitSai inserirMonitSai(MonitSai monitSai) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.persist(monitSai);
			
			em.getTransaction().commit();
			return monitSai;
		} catch (Exception e) {
			em.getTransaction().rollback();
		    throw new Exception(e);
		}
  }
	
	public List<MonitSai> recuperarTodosMonitSais() throws Exception {		
		try {
			List<MonitSai> monitSais = new ArrayList<>();
			em.getTransaction().begin();
			
			monitSais = em.createQuery("Select p from " + MonitSai.class.getSimpleName() + " p").getResultList();
			
			return monitSais;
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
