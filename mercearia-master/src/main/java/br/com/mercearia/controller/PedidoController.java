package br.com.mercearia.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.PedidoDao;
import br.com.mercearia.model.Pedido;


@ViewScoped
@Named(value="pedidoController")
public class PedidoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private PedidoDao pedidoDao = new PedidoDao();	
    private Pedido pedido = new Pedido();
      	
	public void salvarPedido() throws Exception {
		pedidoDao.inserirPedido(pedido);
	}
		
	 public Pedido getPedido() {
			return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}	
	
	public List<Pedido> listarPedidos() {
		return pedidoDao.recuperarTodosPedido();
	}
	    
}
