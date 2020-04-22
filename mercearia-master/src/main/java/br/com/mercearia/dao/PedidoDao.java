package br.com.mercearia.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mercearia.model.Pedido;

public class PedidoDao {
	
	// Gerenciamento e acesso ao banco de dados
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit_app");	
	private EntityManager em = factory.createEntityManager();    
	
	public Pedido inserirPedido(Pedido pedido) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.persist(pedido);
			
			em.getTransaction().commit();
			return pedido;
		} catch (Exception e) {
			em.getTransaction().rollback();
		    throw new Exception(e);
		}
  }
	
	public List<Pedido> recuperarTodosPedido() {
		List<Pedido> pedido = new ArrayList<>();	
		try {
			pedido = em.createQuery("Select p from " + Pedido.class.getSimpleName() + " p").getResultList();			
		} catch (Exception e) {			
		   System.out.println(e.getMessage());		   
		}
		return pedido;
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
