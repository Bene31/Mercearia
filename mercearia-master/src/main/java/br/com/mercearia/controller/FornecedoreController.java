package br.com.mercearia.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.FornecedorDao;
import br.com.mercearia.model.Fornecedor;


@ViewScoped
@Named(value="fornecedoreController")
public class FornecedoreController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private FornecedorDao fornecedorDao = new FornecedorDao();	
    private Fornecedor fornecedor = new Fornecedor();
      	
	public void salvarFornecedor() throws Exception {
		fornecedorDao.inserirFornecedor(fornecedor);
	}
		
	 public Fornecedor getFornecedor() {
			return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}	
	
	public List<Fornecedor> listarFornecedores() {
		return fornecedorDao.recuperarTodosFornecedores();
	}
	    
}
