package br.com.mercearia.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mercearia.model.Caixa;

public class CaixaDao {
	
	// Gerenciamento e acesso ao banco de dados
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit_app");	
	private EntityManager em = factory.createEntityManager();    
	
	public Caixa inserirCaixa(Caixa caixa) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.persist(caixa);
			
			em.getTransaction().commit();
			return caixa;
		} catch (Exception e) {
			em.getTransaction().rollback();
		    throw new Exception(e);
		}
  }
	
	public List<Caixa> recuperarTodosCaixas() throws Exception {		
		try {
			List<Caixa> caixas = new ArrayList<>();
			em.getTransaction().begin();
			
			caixas = em.createQuery("Select p from " + Caixa.class.getSimpleName() + " p").getResultList();
			
			return caixas;
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
