package br.com.mercearia.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mercearia.model.Produto;

public class ProdutoDao {
	
	// Gerenciamento e acesso ao banco de dados
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit_app");	
	private EntityManager em = factory.createEntityManager();    
	
	public Produto inserirProduto(Produto produto) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.persist(produto);
			
			em.getTransaction().commit();
			return produto;
		} catch (Exception e) {
			em.getTransaction().rollback();
		    throw new Exception(e);
		}
  }
	
	public List<Produto> recuperarTodosProdutos() throws Exception {		
		try {
			List<Produto> produtos = new ArrayList<>();
			em.getTransaction().begin();
			
			produtos = em.createQuery("Select p from " + Produto.class.getSimpleName() + " p").getResultList();
			
			return produtos;
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
