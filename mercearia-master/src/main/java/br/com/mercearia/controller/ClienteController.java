package br.com.mercearia.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.ClienteDao;
import br.com.mercearia.model.Cliente;


@ViewScoped
@Named(value="clienteController")
public class ClienteController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ClienteDao clienteDao = new ClienteDao();	
    private Cliente cliente = new Cliente();
      	
	public void salvarCliente() throws Exception {
		clienteDao.inserirCliente(cliente);
	}
		
	 public Cliente getCliente() {
			return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
	public List<Cliente> listarClientes() {
		return clienteDao.recuperarTodosCliente();
	}
	    
}
