package br.com.mercearia.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mercearia.model.Fornecedor;

public class FornecedorDao {
	
	// Gerenciamento e acesso ao banco de dados
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit_app");	
	private EntityManager em = factory.createEntityManager();    
	
	public Fornecedor inserirFornecedor(Fornecedor fornecedor) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.persist(fornecedor);
			
			em.getTransaction().commit();
			return fornecedor;
		} catch (Exception e) {
			em.getTransaction().rollback();
		    throw new Exception(e);
		}
  }
	
	public List<Fornecedor> recuperarTodosFornecedores() {
		List<Fornecedor> fornecedor = new ArrayList<>();	
		try {
			fornecedor = em.createQuery("Select p from " + Fornecedor.class.getSimpleName() + " p").getResultList();			
		} catch (Exception e) {			
		   System.out.println(e.getMessage());		   
		}
		return fornecedor;
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
